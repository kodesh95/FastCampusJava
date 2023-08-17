package fc.java.course1.part4;

import fc.java.course1.poly.*;

public class AbstractClassTest {
    public static void main(String[] args) {
//        추상클래스는 단독으로 객체를 생성할 수 없다.
//        Animal ani = new Animal()
//                추상클래스이기 때문이다. 불완전하기 때문이다.

//        자식의 도움을 받아 객체를 생성할 수 있다.
//        upcasting
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani= new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).flex(); //downcasting
    }
}
