package InterfaceAnimal;

import day3.InterfaceAnimal.Animal;

public class Dog extends Animal {


    public Dog(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        setDistance(getSpeed()*(double)hours/2);
        System.out.printf("개의 이동거리 = %.1f\n",getDistance());
    }


}
