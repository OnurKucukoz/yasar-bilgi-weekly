package com.yasarbilgi.yasarbilgiweeklyschedule.controllers;


import com.yasarbilgi.yasarbilgiweeklyschedule.requests.DateRequest;
import com.yasarbilgi.yasarbilgiweeklyschedule.requests.UpdateDatesRequest;
import com.yasarbilgi.yasarbilgiweeklyschedule.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/dates")
@AllArgsConstructor
public class UserController {
    UserService userService;
    @PutMapping
    public List<LocalDate> updateDates(@RequestBody UpdateDatesRequest updateDatesRequest){
        return userService.saveDates(updateDatesRequest);
    }
    @PostMapping
    public List<Boolean> getDates(@RequestBody DateRequest dateRequest){
        return userService.getDates(dateRequest);

    }


}
