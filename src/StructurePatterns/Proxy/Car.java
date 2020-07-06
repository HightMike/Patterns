package StructurePatterns.Proxy;

public class Car implements Engine {
    public Car() {
        start();
    }

    private void start() {
        System.out.println("Двигатель заводится");
    }

    @Override
    public void work() {
        System.out.println("Двигатель завелся");
    }
}
