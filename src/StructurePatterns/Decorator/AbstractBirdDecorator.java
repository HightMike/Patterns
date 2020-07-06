package StructurePatterns.Decorator;

abstract class AbstractBirdDecorator implements Bird {

    public Bird someBird;

    AbstractBirdDecorator(Bird someBird) {
        this.someBird = someBird;
    }

}
