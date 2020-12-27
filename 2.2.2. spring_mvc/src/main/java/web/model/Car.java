package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Car {
    private String model;
    private String series;
    private int maxSpeed;
    private List<Car> carList;

    public Car() {}

    public Car(String model, String series, int maxSpeed) {
        this.model = model;
        this.series = series;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public List<Car> getCarsList() {
        carList = new ArrayList<>();
        carList.add(new Car("model1", "seria1", 150));
        carList.add(new Car("model2", "seria2", 250));
        carList.add(new Car("model3", "seria3", 400));
        carList.add(new Car("model4", "seria4", 100));
        carList.add(new Car("model5", "seria5", 350));
        return carList;
    }
}
