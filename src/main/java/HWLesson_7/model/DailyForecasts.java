package HWLesson_7.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyForecasts {

    @JsonProperty(value = "Date")
    private String date;
    @JsonProperty(value = "Temperature")
    private Temperature tempInfo;
    @JsonProperty(value = "Day")
    private Day day;
    @JsonProperty(value = "Night")
    private Night night;

    public DailyForecasts(String date, Temperature tempInfo, Day day, Night night) {
        this.date = date;
        this.tempInfo = tempInfo;
        this.day = day;
        this.night = night;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Temperature getTempInfo() {
        return tempInfo;
    }

    public void setTempInfo(Temperature tempInfo) {
        this.tempInfo = tempInfo;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Night getNight() {
        return night;
    }

    public void setNight(Night night) {
        this.night = night;
    }

    @Override
    public String toString() {
        return "DailyForecasts{" +
                "date='" + date + '\'' +
                ", tempInfo=" + tempInfo +
                ", day=" + day +
                ", night=" + night +
                '}';
    }
}
