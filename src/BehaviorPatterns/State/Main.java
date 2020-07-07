package BehaviorPatterns.State;

public class Main {

    public static void main(String[] args) {
        TV tv = new TV(new STS());

        for (int i = 0; i < 10; i++) {
            tv.nextChanel();
        }
    }

}
