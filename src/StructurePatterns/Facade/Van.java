package StructurePatterns.Facade;

public class Van implements Train{

    @Override
    public void start() {
        System.out.println("люди заходят");
    }

    @Override
    public void stop() {
        System.out.println("люди выходят");
    }
}
