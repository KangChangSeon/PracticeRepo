package Day13.homework.inheritance실습.level01;

import org.w3c.dom.ls.LSOutput;

class Drink {

    private String name;
    private int price;
    private int count;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public Drink() {
    }

    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice() {
        return price * count;
    }

    public static void printTitle() {
        System.out.printf("%-10s%-10s%-10s%-10s", "상품명", "단가", "수량", "금액");
        System.out.println();
    }

    public void printData() {
        System.out.printf("%-10s%-12d%-10d%-10d", name, price, count, getTotalPrice());
        System.out.println();
    }
}

class Alcohol extends Drink {
    private double alcper;

    public Alcohol() {
    }

    public Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }


    public static void printTitle() {
        System.out.printf("%-10s%10s%10s%10s", "상품명 (도수[%])", "단가", "수량", "금액");
        System.out.println();
    }


    @Override
    public void printData() {
        System.out.printf("%s(%.1f) %15s %10s %10s%n",
                super.getName(), alcper, super.getPrice(), super.getCount(), super.getTotalPrice());
        System.out.println();
    }
}

public class Prob1 {

    public static void main(String[] args) {

        Drink coffee = new Drink("커피", 1500, 4);
        Drink tea = new Drink("녹차", 1100, 7);
        Alcohol wine = new Alcohol("와인", 5000, 3, 15.1);

        System.out.println("***** 매 출 전 표 ***** ");
        Drink.printTitle();
        coffee.printData();
        tea.printData();
        System.out.println();

        Alcohol.printTitle();
        wine.printData();

        int sum = coffee.getTotalPrice()
                + tea.getTotalPrice()
                + wine.getTotalPrice();

        System.out.println();
        System.out.println("*** 총금액 " + sum + "원 ***");

    }
}
