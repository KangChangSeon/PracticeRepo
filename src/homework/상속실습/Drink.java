package day13.homework.상속실습;

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
        System.out.println("상품명            단가           수량              금액");
    }

    public void printData(){
        System.out.printf("%-15s %-15d %-15d %-15d\n",name,price,count,getTotalPrice());
    }

}
