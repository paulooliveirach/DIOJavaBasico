public class SmartTv {
    boolean tvStatus = false;
    int chanel = 1;
    int volume = 25;

    public void changeChanel(int newChanel) {
        chanel=newChanel;
    }
    
    public void turnOn() {
        tvStatus = true;
    }
    public void turnOff() {
        tvStatus = false;
    }

    public void increaseVolume() {
        volume ++;
    }

    public void decreaseVolume() {
        volume --;
    }
}
