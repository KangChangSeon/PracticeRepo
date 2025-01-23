class GrandFather {
    void printGrandFather(){
        System.out.println("나는 할아버지입니다.");
    }

}
class SubFather extends GrandFather{
    String familyName = "..";
    String houseAddress ="인천";

    void printFather(){
        System.out.println("나는 아버지입니다! 나는 할아버지로부터 상속받습니다.");
    }
}
class Subson extends SubFather{
    void printSon(){
        System.out.println("나는 아들입니다.");
        System.out.println("나는 아버지로부터 상속받았습니다.");
    }

}



public class InherEx {
    public static void main(String[] args) {

        Subson objSon = new Subson();

        objSon.printGrandFather();
        System.out.printf("?? %s ??\n",objSon.familyName);
        System.out.printf("나의 집은 %s\n",objSon.houseAddress);
        objSon.printFather();
        objSon.printSon();

    }
}