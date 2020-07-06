package StructurePatterns.Facade;

public class Main {

    public static void main(String[] args) {
        Facade trainFacade = new Facade();
        trainFacade.start();
        trainFacade.stop();
    }

}
