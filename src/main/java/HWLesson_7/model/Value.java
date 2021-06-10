package HWLesson_7.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    @JsonProperty(value = "Value")
    private String temperatureValue;

    public Value(String temperatureValue) {
        this.temperatureValue = temperatureValue;
    }

    public String getTemperatureValue() {
        return temperatureValue;
    }

    public void setTemperatureValue(String temperatureValue) {
        this.temperatureValue = temperatureValue;
    }

    @Override
    public String toString() {
        return "Value{" +
                "temperatureValue='" + temperatureValue + '\'' +
                '}';
    }
}
