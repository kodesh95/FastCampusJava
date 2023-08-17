package fc.java.course1.part4;

import fc.java.course1.model.*;

/**
 * CatDogUpcatingTest
 * : 부모가 자식을 가리키는 객체생성법 (upcasting)
 * : 부모타입의 변수에 자식을 생성
 * @author comet
 * @version 17
 * date of preparation 2023-08-13
 * time 오전 10:11
**/
public class CatDogUpcatingTest {
    public static void main(String[] args) {
        Animal ani = new Cat();
        ani.eat();

        ani = new Dog();
        ani.eat();
    }

}
