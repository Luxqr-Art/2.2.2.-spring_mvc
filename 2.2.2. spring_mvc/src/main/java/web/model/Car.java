package web.model;

public class Car {

    private String model;
    private String  engine;
    private double price;
    private int speed;

    public Car(String model, String engine, double price, int speed) {
        this.model = model;
        this.engine = engine;
        this.price = price;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", price=" + price  +
                ", speed=" + speed +
                '}';
    }
}

