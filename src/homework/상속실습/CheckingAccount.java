package day13.homework.상속실습;

public class CheckingAccount extends Account{
    private String cardNo;

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
        super(accId, balance, ownerName);
        this.cardNo = cardNo;
    }

    public void pay(String cardNo,long amount){
        if(getCardNo().equals(cardNo) && amount<=getBalance()){
            setBalance(getBalance()-amount);
        }
        else if(amount>getBalance()) System.out.println("지불이 불가능합니다.");
    }
    @Override
    public void calcRate() {
    }
}
