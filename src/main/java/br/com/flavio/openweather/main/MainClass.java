package br.com.flavio.openweather.main;

import br.com.flavio.openweather.model.Weather;
import br.com.flavio.openweather.model.WeatherModel;
import br.com.flavio.openweather.service.ConvertData;
import br.com.flavio.openweather.service.Request;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainClass {

    Scanner read = new Scanner(System.in);
    private final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather?q=";
    private final String API_KEY = "******************";
    Request send = new Request();
    ConvertData converter = new ConvertData();
    public void showMenu(){

        var menu = """
                    ************************************************
                    Bem vindo á pesquisa de Clima! Digite uma cidade!
                    
                    
                """;
        System.out.println(menu);

        var city = read.nextLine();

        var json = send.sendRequest(BASE_URL+city+API_KEY);
        System.out.println(json);
        var data = converter.obterDados(json, WeatherModel.class);
        System.out.println(data);
        //data.forEach(System.out::println);
        List<Weather> weatherList = data.weather();
        weatherList.forEach(System.out::println);
       var listId =  weatherList.stream().map(weather -> weather.id()).collect(Collectors.toList());
        listId.forEach(System.out::println);
    }
}
