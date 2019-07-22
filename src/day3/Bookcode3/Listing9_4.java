package day3.Bookcode3;

public class Listing9_4 {
    public static void main(String[] args){
        TV tv1=new TV();
        tv1.trunOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2=new TV();
        tv2.trunOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1 is channel is "+tv1.channel
                 +" and volume level is "+tv1.volumeLevel);
        System.out.println("tv2 is channel is "+tv2.channel
                 +" and volume level is "+tv2.volumeLevel);
    }

}
