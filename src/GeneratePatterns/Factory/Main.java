package GeneratePatterns.Factory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Car car = factory.getCar("мазерати");
        car.doCar();
    }

}
