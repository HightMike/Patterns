package BehaviorPatterns.State;

public class TV {
    private Chanel chanel;
    TV(Chanel chanel) {
        this.chanel = chanel;
    }
    void nextChanel() {
        if (chanel instanceof STS) {
            chanel = new TNT();
        } else {
            chanel = new STS();
        }
        chanel.play();
    }
}
