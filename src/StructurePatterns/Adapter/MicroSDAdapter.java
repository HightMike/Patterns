package StructurePatterns.Adapter;

public class MicroSDAdapter extends SD implements MicroSD{

    @Override
    public void sendData() {
        sendSomeData();
    }
}
