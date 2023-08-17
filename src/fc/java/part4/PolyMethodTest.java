package fc.java.part4;

import fc.java.model.*;
/**
 * PolyMethodTest
 * : 다형성 인수(하나의 타입으로 여러 가지 타입을 받을 수 있는 인수)
 * : 부모이기 때문에!!!
 * @author comet
 * @version 17
 * date of preparation 2023-08-15
 * time 오후 10:21
**/
public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);

        Cat c = new Cat();
        display(c);


    }
// 다형성 인수가 없다면 display를 오버라이딩해서 여러 개를 만들어야한다.
// 다형성 인수로 인해 한 개의 메소드만으로 여러가지 타입의 인수를 받을 수 있다.
    private static void display(Animal a) {

        a.eat();
//        Cat 타입으로 받은 경우에만 실행
        if (a instanceof Cat)
            ((Cat)a).flex();
    }

}
