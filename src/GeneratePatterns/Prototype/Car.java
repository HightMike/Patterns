package GeneratePatterns.Prototype;

public class Car implements Copyable<Car>{

    private String model;
    private int power;

    public Car(int power, String model) {
        this.model = model;
        this.power = power;
    }

    @Override
    public Car copy() {
        return new Car(power, model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
