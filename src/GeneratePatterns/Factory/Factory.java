package GeneratePatterns.Factory;

public class Factory {

    public Car getCar(String name) {

        Car car =null;

        if (name.toLowerCase().equals("лада")){
            car = new Lada();
        } else if (name.toLowerCase().equals("мазерати")) {
            car = new Maserati();
        }
        return car;

    }
}
