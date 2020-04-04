package GeneratePatterns.AbstractFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = null;
        String region = new String("ru");

        if (region.equals("ua")) {
            factory = new UaAbsFactory();
        } else if (region.equals("ru")){
            factory = new RuAbsFactory();
        }
        Lada lada = factory.getLada();
        System.out.println(lada.getLadaPrice());
    }

}
