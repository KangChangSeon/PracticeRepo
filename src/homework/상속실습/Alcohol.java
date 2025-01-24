package day13.homework.상속실습;

class Alcohol extends Drink{

    double alcper;

    public Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }

    public double getAlcper() {
        return alcper;
    }

    public void setAlcper(double alcper) {
        this.alcper = alcper;
    }

    public static void printTitle() {
        System.out.println("상품명(도수[%])         단가             수량             금액");

    }

    @Override
    public void printData() {
        System.out.printf("%s(%-2.1f)             %-15d %-15d %-10d\n",name,alcper,price,count,getTotalPrice());
    }


}
