package com.rahul.weatherApi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirQuality{
    public double co;
    public double no2;
    public double o3;
    public double so2;
    public double pm2_5;
    public double pm10;
    public int us_epa_index;
    public int gb_defra_index;

}