package com.rahul.weatherApi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Condition{
    public String text;
    public String icon;
    public int code;
}
