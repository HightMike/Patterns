package StructurePatterns.Decorator;

public class DecoratorSpeedBird extends AbstractBirdDecorator{

    DecoratorSpeedBird(Bird someBird) {
        super(someBird);
    }

    @Override
    public void fly() {
        System.out.println("Теперь птица летает очень быстро");
        someBird.fly();
    }
}
