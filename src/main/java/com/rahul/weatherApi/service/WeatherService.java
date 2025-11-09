package com.rahul.weatherApi.service;

import com.rahul.weatherApi.dto.Root;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    private RestTemplate template = new RestTemplate();


public Root getData(String city){
        String url = apiUrl+"key="+apiKey+"&q="+city+"&aqi=yes";
        Root response = template.getForObject(url, Root.class);
        return response;
}
}
