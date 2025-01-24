package Day12.inheritance;

class GrandFather {
    void printGrandFather() {
        System.out.println("나는 할아버지입니다.");
    }
}

class SubFather extends GrandFather {
    String familyName;
    String houseAddress;
    void printFather() {
        System.out.println("나는 아버지입니다. 나는 할아버지로부터 상속받습니다.");
    }
}

class SubSon extends SubFather {
    void printSon() {
        System.out.println("나는 아들입니다.");
        System.out.println("나는 아버지로부터 상속받습니다.");
        System.out.println("나의 아버지는 프로그래머");
        System.out.printf("나의 집은 %s\n",houseAddress);
    }
}

public class InherMain {
    public static void main(String[] args) {
        SubSon objSon = new SubSon();
        objSon.houseAddress = "인천";
        objSon.familyName = "?";
        objSon.printSon();
        objSon.printFather();
        objSon.printGrandFather();
    }
}

//
//class Parent {
//    int field1 = 20;
//    void method1() {
//        System.out.println("부모의 메서드");
//    }
//}
//
//class Child extends Parent {
//    int field2 = 20;
//    void method2() {
//        System.out.println("자식의 메서드");
//    }
//}
//
//public class InherMain{
//    public static void main(String[] args) {
//        Child objChild = new Child();
//        objChild.method1();
//        objChild.method2();
//        System.out.println(objChild.field1);
//        System.out.println(objChild.field2);
//    }
//}