package fc.java.part4;

import fc.java.model.*;
public class OverrideTest {
    public static void main(String[] args) {
        Animal ani = new Dog();

        ani.eat(); //실행시점에서 Dog의 eat()을 실행한다(동적바인딩)

        ani = new Cat(); //부모는 한명이라서 그냥 ani로 한다.
        ani.eat();

    }
}
