package day12.inher;


class Parent{
    int field;
    void method(){
        System.out.println("나는 부모클래스의 method1이야");
    }
}
class Child extends  Parent{
    int field2;
    void method2(){
        System.out.println("나는 자식클래스의 method2이야");
    }
}

public class InherMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        System.out.println(parent.field);
        parent.method();
        System.out.println(child.field + " "+child.field2);
        child.method();
        child.method2();
    }

}
