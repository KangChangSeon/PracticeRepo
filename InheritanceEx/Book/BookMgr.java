package DAY250124.Inheritance.BookEx;

public class BookMgr {
    private Book[] booklist;

    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBooklist(){
        for(int i=0; i<booklist.length; i++){
            System.out.println(booklist[i].getTitle());
        }
    }

    public void printTotalPrice(){
        int totalPrice =0;

        for(int i=0; i<booklist.length; i++){
            totalPrice+=booklist[i].getPrice();
        }
        System.out.printf("전체 책 가격의 합 : %d",totalPrice);

    }
}