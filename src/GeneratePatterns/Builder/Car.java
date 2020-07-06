package GeneratePatterns.Builder;

public class Car {

    private final String mark;
    private final String model;
    private final int price;
    private final int power;
    private final int door;

    public static class Builder {

        private String mark;
        private String model;

        private int price = 10000;
        private int power = 149;
        private int door = 4;

        Builder(String mark, String model) { //обязательные параметры
            this.mark = mark;
            this.model = model;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }
        public Builder setPower(int power) {
            this.power = power;
            return this;
        }
        public Builder setDoor(int door) {
            this.door = door;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        mark = builder.mark;
        model = builder.model;
        price = builder.price;
        power = builder.power;
        door = builder.door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", power=" + power +
                ", door=" + door +
                '}';
    }
}
