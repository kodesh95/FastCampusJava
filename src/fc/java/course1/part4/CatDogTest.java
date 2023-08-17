package fc.java.course1.part4;

import fc.java.course1.model.*;

public class CatDogTest {
    public static void main(String[] args) {
//        Dog객체를 생성하고 eat()동작을 구동해보자.
        Dog d =new Dog();
        d.eat();
//        Cat객체를 생성하고 eat(),flex()동작을 구동해보자.
        Cat c = new Cat();
        c.eat();
        c.flex();
    }
}
