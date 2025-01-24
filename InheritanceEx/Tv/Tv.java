package DAY250124.Inheritance.TvEx;

public class Tv {
    private String color;
    private boolean power;
    private int channel;

    public Tv(){
        color = "black";
        power = false;
        channel = 0;
    }

    public void power(){
        power = !power;
    }
    public void channelUp(){
        channel+=1;
    }
    public void channelDown(){
        channel-=1;
    }
    public void print (){
        System.out.printf("color : %s   ",color);
        System.out.printf("power : %b   ",power);
        System.out.printf("channel : %d\n",channel);
    }

}
