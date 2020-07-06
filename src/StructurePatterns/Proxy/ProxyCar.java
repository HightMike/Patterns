package StructurePatterns.Proxy;

//реализовав тот же интерфейс переопределяем работу. По похожему сценарию работает DynemicProxy.
public class ProxyCar implements Engine{

    private Car car;

    @Override
    public void work() {
        if (car==null) {
            car = new Car();
        }
        car.work();
    }
}
