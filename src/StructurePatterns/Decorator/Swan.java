package StructurePatterns.Decorator;

public class Swan implements Bird{

    private String value;

    public Swan(String value) {
        this.value = value;
    }

    @Override
    public void fly() {
        System.out.println(value);
    }


}
