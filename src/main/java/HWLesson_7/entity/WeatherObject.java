package HWLesson_7.entity;

public class WeatherObject {
    private String cityName;
    private String date;
    private String dayDescription;
    private String nightDescription;
    private String maxTemperature;
    private String minTemperature;

    public WeatherObject(String cityName, String date, String dayDescription, String nightDescription, String maxTemperature, String minTemperature) {
        this.cityName = cityName;
        this.date = date;
        this.dayDescription = dayDescription;
        this.nightDescription = nightDescription;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDayDescription() {
        return dayDescription;
    }

    public void setDayDescription(String dayDescription) {
        this.dayDescription = dayDescription;
    }

    public String getNightDescription() {
        return nightDescription;
    }

    public void setNightDescription(String nightDescription) {
        this.nightDescription = nightDescription;
    }

    public String getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(String maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public String getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(String minTemperature) {
        this.minTemperature = minTemperature;
    }

    @Override
    public String toString() {
        return "WeatherObject{" +
                "cityName='" + cityName + '\'' +
                ", date='" + date + '\'' +
                ", dayDescription='" + dayDescription + '\'' +
                ", nightDescription='" + nightDescription + '\'' +
                ", maxTemperature='" + maxTemperature + '\'' +
                ", minTemperature='" + minTemperature + '\'' +
                '}';
    }

}
