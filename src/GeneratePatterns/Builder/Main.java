package GeneratePatterns.Builder;

public class Main {
    public static void main(String[] args) {

        Car mazda = new Car.Builder("mazda0","CX5")
                .setDoor(5).setPower(223).build();
        System.out.println(mazda);

    }

}
