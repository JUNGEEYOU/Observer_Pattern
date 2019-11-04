package com.company;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 4f);
        weatherData.setMeasurements(70, 22, 5f);
        weatherData.setMeasurements(60, 11, 6f);

    }
}
