package StructurePatterns.Adapter;

public class Main {

    public static void main(String[] args) {
        MicroSD microSD = new MicroSDAdapter();
        microSD.sendData();

        MicroSD microSD1 = new MicroSDAdapterAlt(new SD());
        microSD1.sendData();
    }
}
