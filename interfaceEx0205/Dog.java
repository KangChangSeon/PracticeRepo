package day250205.interfaceEx.ex02;

public class Dog extends Animal{


    public Dog(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        this.setDistance(this.getSpeed() * hours * 0.5);
    }
}
