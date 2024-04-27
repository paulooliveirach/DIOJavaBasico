public class SmartTvUser {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("Tv is on? " + smartTv.tvStatus);
        System.out.println("Current channel: " + smartTv.chanel);
        System.out.println("Current volume: " + smartTv.volume);

        smartTv.turnOn(); 
        System.out.println("New Tv status ->  " + smartTv.tvStatus);

        smartTv.turnOff(); 
        System.out.println("New Tv status ->  " + smartTv.tvStatus);

        
        smartTv.increaseVolume(); 
        System.out.println("Tv volume: " + smartTv.volume);

        smartTv.decreaseVolume(); 
        smartTv.decreaseVolume(); 
        smartTv.decreaseVolume(); 
        smartTv.decreaseVolume(); 
        System.out.println("Tv volume: " + smartTv.volume);
        System.out.println("Tv actual chanel: " + smartTv.chanel);

        smartTv.changeChanel(13);

        System.out.println("Tv actual chanel: " + smartTv.chanel);

    }
}