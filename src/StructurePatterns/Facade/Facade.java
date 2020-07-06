package StructurePatterns.Facade;

public class Facade {

    private Boiler boiler;
    private Van van;

    Facade() {
        boiler = new Boiler();
        van = new Van();
    }

    public void start(){
        boiler.start();
        van.start();
    }
    public void stop(){
        boiler.stop();
        van.stop();
    }

}
