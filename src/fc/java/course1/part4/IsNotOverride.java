package fc.java.course1.part4;

import fc.java.course1.poly.*;

public class IsNotOverride {
    public static void main(String[] args) {
//        재정의(override)를 하지 않았기 때문에
//        --> 부모가 명령을 내리면(메세지를보내면) 오작동을 한다.
//        다형성을 보장하지 않음
//        그렇다면 다형성을 보장하게 하려면?
//        강제로 재정의를 하도록 만들어준다. -->추상클래스와 인터페이스 등장

        Animal ani = new Dog();
        ani.eat();

        ani= new Cat();
        ani.eat();
    }
}
