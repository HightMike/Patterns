package StructurePatterns.Proxy;

public class Main {
    public static void main(String[] args) {
        Engine car = new ProxyCar();
        car.work();
    }
}
