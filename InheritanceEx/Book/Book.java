package DAY250124.Inheritance.BookEx;

public class Book {

    public Book(){}
    public Book(String title, int price){
        this.title=title;
        this.price=price;
    }

    private String title;
    private int price;

    public void setTitle (String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
