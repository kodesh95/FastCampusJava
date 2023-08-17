package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

/**
 * PolyTest
 * :다형성(객체지향원리)
 * 부모의 메시지를 자식들이 자기들만의 방식으로 메세지를 구동하는 것.
 * upcasting으로 객체생성 , 상속관계 , override , 동적바인딩
 *
 * @author comet
 * @version 17
 * date of preparation 2023-08-15
 * time 오전 7:40
 **/
public class PolyTest {
    public static void main(String[] args) {


        Animal a = new Dog();
        a.eat(); // 실행시점에서 사용될메소드가 결정되는 바인딩(동적바인딩)

        a = new Cat();
        a.eat();
//          downcast
        ((Cat) a).flex();

    }
}
/*
* 정적바인딩(overloading)
컴파일 시점에서 사용될 메소드가 결정되는 바인딩 = 실행시점 전에 사용될메소드가 결정되어 있는 바인딩
-> 실행속도와 무관

동적바인딩(override=재정의)
실행시점에서 사용될메소드가 결정되는 바인딩(동적바인딩)
-> 실행속도에 영향을 줌
* */