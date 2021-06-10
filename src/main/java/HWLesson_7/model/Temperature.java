package HWLesson_7.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Temperature {
    @JsonProperty(value = "Minimum")
    private Value min;
    @JsonProperty(value = "Maximum")
    private Value max;

    public Temperature() {}

    public Temperature(Value min, Value max) {
        this.min = min;
        this.max = max;
    }

    public Value getMin() {
        return min;
    }

    public void setMin(Value min) {
        this.min = min;
    }

    public Value getMax() {
        return max;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }

    public void setMax(Value max) {
        this.max = max;
    }
}
