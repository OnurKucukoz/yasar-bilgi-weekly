package com.yasarbilgi.yasarbilgiweeklyschedule.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
@Getter
@AllArgsConstructor
@ToString
public class UpdateDatesRequest {
    private long userId;
    private List<Integer> days;
    private List<Integer> months;
    private List<Integer> years;
    private List<Boolean> isSelected;
}
