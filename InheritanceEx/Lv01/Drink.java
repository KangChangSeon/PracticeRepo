package DAY250124.Inheritance.Lv01Ex;

public class Drink {
    private String name;
    private int price;
    private int count;

    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice() {
        return price * count;
    }

    public static void printTitle() {
        System.out.println("상품명 단가 수량 금액");
    }

    public void printData() {
        System.out.printf("%s %d %d %d\n", name, price, count, getTotalPrice());
    }

    public String getName() {
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getCount(){
        return count;
    }
}
