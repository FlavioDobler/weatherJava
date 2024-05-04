package br.com.flavio.openweather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherModel(List<Weather> weather)  {
}
