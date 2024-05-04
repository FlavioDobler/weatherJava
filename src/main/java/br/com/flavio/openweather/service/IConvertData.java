package br.com.flavio.openweather.service;

import java.util.List;

public interface IConvertData {

    <T> T obterDados(String json, Class<T> clase);

    <T> List<T> obterLista(String json, Class<T> classe);

}
