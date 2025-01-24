package day13.homework.class실습;

public class BookMgr {
    Book[] booklist = new Book[5];
    int totalprice;

    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBooklist(){
        for (int i = 0; i < booklist.length; i++) {
            System.out.println(booklist[i].getTitle());
        }

    }

    public void printTotalPrice() {
        for (int i = 0; i < booklist.length; i++) {
            totalprice += booklist[i].getPrice();
        }
        System.out.println("전체 책 가격의 합 : "+ totalprice);

    }
}
