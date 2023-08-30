package com.yasarbilgi.yasarbilgiweeklyschedule.services;

import com.yasarbilgi.yasarbilgiweeklyschedule.entities.YasarUser;
import com.yasarbilgi.yasarbilgiweeklyschedule.repositories.UserRepository;
import com.yasarbilgi.yasarbilgiweeklyschedule.requests.DateRequest;
import com.yasarbilgi.yasarbilgiweeklyschedule.requests.UpdateDatesRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<LocalDate> saveDates(UpdateDatesRequest updateDatesRequest){
        YasarUser user = userRepository.findById(updateDatesRequest.getUserId()).orElseThrow();
        List<Integer> days = updateDatesRequest.getDays();
        List<Integer> months = updateDatesRequest.getMonths();
        List<Integer> years = updateDatesRequest.getYears();
        List<Boolean> isSelected = updateDatesRequest.getIsSelected();
        List<LocalDate> dateList = new ArrayList<>();
        for(int i = 0; i < days.size(); i++){
            LocalDate dateToAdd = LocalDate.of(years.get(i),months.get(i),days.get(i));
            dateList.add(dateToAdd);
        }

        List<LocalDate> userDates = user.getDates();
        for(int i = 0; i < dateList.size(); i++){
           if(userDates.contains(dateList.get(i)) && !isSelected.get(i)){
                userDates.remove(dateList.get(i));
           }
           else if(!userDates.contains(dateList.get(i)) && isSelected.get(i)){
               userDates.add(dateList.get(i));
           }
        }

        user.setDates(userDates);
        return userDates;
    }
    public List<Boolean> getDates(DateRequest dateRequest){
        YasarUser user = userRepository.findById(dateRequest.getUserId()).orElseThrow();
        List<LocalDate> dates = user.getDates();
        List<Integer> days = dateRequest.getDays();
        List<Integer> months = dateRequest.getMonths();
        List<Integer> years = dateRequest.getYears();
        List<Boolean> existingDates = new ArrayList<>();
        for(int i = 0; i < days.size(); i++){
            LocalDate dateToCheck = LocalDate.of(years.get(i),months.get(i),days.get(i));
            if(dates.contains(dateToCheck)){
                existingDates.add(true);
            }
            else{
                existingDates.add(false);
            }
        }
        return existingDates;
    }
}
