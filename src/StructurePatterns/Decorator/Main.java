package StructurePatterns.Decorator;

public class Main {

    public static void main(String[] args) {
        Bird bird = new DecoratorEyeBird(new DecoratorSpeedBird(new Swan("лебедь полетел")));
        bird.fly();
    }

}
