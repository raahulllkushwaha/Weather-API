package com.rahul.weatherApi.controller;

import com.rahul.weatherApi.dto.Root;
import com.rahul.weatherApi.dto.WeatherResponse;
import com.rahul.weatherApi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class Controller {
    @Autowired
    private WeatherService service;


    @GetMapping("/my/{city}")
    public Root getWeather(@PathVariable String city){
        return service.getData(city);
    }

    @GetMapping("simple/{city}")
    public WeatherResponse getSimpleWeather(@PathVariable String city){
        Root data = service.getData(city);

        WeatherResponse response = new WeatherResponse(
                data.getLocation().getName(),
                data.getCurrent().getCondition().getText(),
                data.getCurrent().getTemp_c()
        );
        return response;
    }
}
