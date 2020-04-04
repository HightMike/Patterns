package GeneratePatterns.AbstractFactory;

public class UaAbsFactory implements Factory {
    @Override
    public Lada getLada() {
        return new UaLada();
    }
    @Override
    public Maserati getMaserati() {
        return new UaMaserati();
    }

    @Override
    public BMW getBMW() {
        return new UaBMW();
    }
}
