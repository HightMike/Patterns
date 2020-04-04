package GeneratePatterns.AbstractFactory;

public class RuAbsFactory implements Factory{
    @Override
    public Lada getLada() {
        return new RuLada();
    }

    @Override
    public Maserati getMaserati() {
        return new RuMaserati();
    }

    @Override
    public BMW getBMW() {
        return new RuBMW();
    }
}
