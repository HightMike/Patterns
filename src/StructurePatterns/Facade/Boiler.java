package StructurePatterns.Facade;

public class Boiler implements Train {

    @Override
    public void start() {
        System.out.println("котел раскочегаривается");
    }

    @Override
    public void stop() {
        System.out.println("котел остывает");

    }
}
