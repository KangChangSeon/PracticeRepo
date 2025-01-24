package Day13.homework.class실습;

public class BookMgr {
    Book[] booklist;

    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBooklist() {
        for (int i = 0; i < booklist.length; i++) {
            System.out.println(booklist[i].getTitle());
        }
    }

    public void printTotalPrice() {
        int sum = 0;
        for (int i = 0; i < booklist.length; i++) {
            booklist[i].getPrice();
            sum += booklist[i].getPrice();
        }
        System.out.println("전체 책 가격의 합 : " + sum);
    }
}
