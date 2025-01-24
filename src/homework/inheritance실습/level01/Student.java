package day13.homework.inheritance실습.level01;

public class Student {
    private String name;
    private String subject;
    private int fee;
    private double returnFee;

    public Student(String name, String subject, int fee) {
        this.name = name;
        this.subject = subject;
        this.fee = fee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void setReturnFee(double returnFee) {
        this.returnFee = returnFee;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getFee() {
        return fee;
    }

    public double getReturnFee() {
        return returnFee;
    }

    public void calcReturnFee(){
        if(getSubject().equals("javaprogram")){
            setReturnFee((getFee()/100)*25);
        }else if(getSubject().equals("jspprogram")){
            setReturnFee((getFee()/100)*20);
        }else System.out.println("그런 과정명은 없습니다");
    }

    public void print(){
        System.out.printf("%s 씨의 과정명은 %s 이고 교육비는 %d 이며 환급금은 %.1f",getName(),getSubject(),getFee(),getReturnFee());
    }



}
