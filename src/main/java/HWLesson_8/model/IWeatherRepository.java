package HWLesson_8.model;

import java.util.List;

public interface IWeatherRepository {

    List<Weather> getAllData();

    void saveWeatherObject (Weather weather);
}
