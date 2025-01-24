package day13.homework.class실습;

public class Tv {
    String color;
    boolean power;
    int channel;

    public Tv(){
        color = "black";
        power = false;
        channel = 0;
    }

    public void power(){
        if (power == false) power = true;
        else power = false;

    }
    public void channelUp(){
        channel++;
    }
    public void channalDown(){
        channel--;
    }
    public void print(){
        System.out.print("현재 color :" +color+"   ");
        System.out.print("현재 power :"+power+"   ");
        System.out.print("현재 channel: "+channel+"\n");
    }

}
