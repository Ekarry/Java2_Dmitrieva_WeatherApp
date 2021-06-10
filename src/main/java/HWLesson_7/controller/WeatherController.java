package HWLesson_7.controller;

import HWLesson_7.model.AccuWeatherProvider;
import HWLesson_7.model.IWeatherProvider;
import HWLesson_7.model.Period;

import java.io.IOException;

public class WeatherController implements IWeatherController {

    private final IWeatherProvider weatherProvider = new AccuWeatherProvider();

    @Override
    public void onUserInput(int command) throws IOException {
        switch (command){
            case 1:
                getCurrentWeather();
                break;
            case 2:
                getFiveDayWeather();
                break;
            default:
                System.out.println("Нет такой команды");
                System.exit(1);
        }
    }

    private void getCurrentWeather() throws IOException {
        weatherProvider.getWeather(Period.NOW);
    }

    private void getFiveDayWeather() throws IOException {
        weatherProvider.getWeather(Period.FIVE_DAYS);
    }
}
