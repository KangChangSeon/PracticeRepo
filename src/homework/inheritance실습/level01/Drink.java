package day13.homework.inheritance실습.level01;

public class Drink {
    String name;
    int price;
    int count;
    int Totalprice;



    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public int getTotalPrice() {
        Totalprice= price*count;
        return Totalprice;
    }
    public Drink(){}
    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public static void printTitle(){
        System.out.println("상품명\t단가\t\t수량\t\t금액");
    }

    public void printData(){
        System.out.printf("%s\t\t%d\t%d\t\t%d\n",name,price,count,getTotalPrice());
    }

}
