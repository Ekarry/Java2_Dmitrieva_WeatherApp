package HWLesson_7.model;

import java.io.IOException;

public interface IWeatherProvider {
    void getWeather(Period period) throws IOException;
}
