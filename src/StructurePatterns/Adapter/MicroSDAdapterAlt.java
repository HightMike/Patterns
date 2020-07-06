package StructurePatterns.Adapter;

public class MicroSDAdapterAlt implements MicroSD{

    private SD sd = null;

    MicroSDAdapterAlt (SD sd) {
        this.sd = sd;
    }

    @Override
    public void sendData() {
        sd.sendSomeData();
    }
}
