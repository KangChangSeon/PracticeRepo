package DAY250124.Inheritance.Lv01Ex;

public class Alcohol extends Drink {
    private double alcper;

    public Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }

    public static void printTitle() {
        System.out.println("상품명(도수[%]) 단가 수량 금액");
    }

    @Override
    public void printData() {
        System.out.printf("%s(%.1f%%) %d %d %d\n", getName(), alcper, getPrice(), getCount(), getTotalPrice());
    }

}
