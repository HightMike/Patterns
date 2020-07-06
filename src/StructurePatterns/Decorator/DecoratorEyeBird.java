package StructurePatterns.Decorator;

public class DecoratorEyeBird extends AbstractBirdDecorator{

    DecoratorEyeBird(Bird someBird) {
        super(someBird);
    }

    @Override
    public void fly() {
        System.out.println("обернули класс и теперь птица умеет стрелять глазами");
        someBird.fly();
    }
}
