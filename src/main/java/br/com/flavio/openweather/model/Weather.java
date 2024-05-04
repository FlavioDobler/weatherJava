package br.com.flavio.openweather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Weather (String id, String main ,String description, String icon) {

}
