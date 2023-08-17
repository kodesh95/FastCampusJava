package fc.java.part4;

import fc.java.poly.*;

/**
 * InterfaceTest
 * :인터페이스의 등장
 * 다형성이 100% 보장
 * 부모가 인터페이스이면 자식의 내부 동작방식을 전혀 몰라도 동작을 시킬 수 있다.
 * @author comet
 * @version 17
 * date of preparation 2023-08-16
 * time 오후 8:13
**/
public class InterfaceTest {
    public static void main(String[] args) {
//        RemoCon remoCon=new RemoCon();
//        인터페이스도 자신의 객체 생성x -->upcasting 부모역할

        RemoCon remoCon=new Radio();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.volUp();
        remoCon.volDown();
        remoCon.internet(); // 오동작이라고 생각하자

        remoCon=new TV();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.volUp();
        remoCon.volDown();
        remoCon.internet();
    }
}
/* 서로 다른 동작을 가진 클래스를 상속관계로 만들어서 동작을 시켜야한다면?
*  --> 공통기능을 만들어서 상속구조로 사용해보자
* 추상클래스는 추상메소드와 구현메소드를 가질 수 있기 때문에
* 자식클래스의 입장에서 구현메소드가 맞지 않는 자식들조차도 구현메소드를 실행하게 된다.
* 따라서 구현메소드를 사용하지 않아야한다.
*  --> 추상메소드만 가진 추상클래스를 [인터페이스]라고 한다!!
*
* 따라서 서로 다른 동작을 가진 클래스들을 올바르게 동작시키기 위해서 인터페이스가 등장
* */

/* 인터페이스에서 사용하는 final static 상수
* 무한하게 추상메소드를 실행시키지 않고 제한을 하기 위함
* public final static int 상수명 = 값;
* static은 객체를 생성하지 않아도 .상수명으로 사용할 수 있기 때문이다.
* */

/*
* 다형성을 100%보장하기 위해 등장
* 서로 다른 클래스의 공통부분을 묶을 때 사용
* 단독으로 객체생성x
* 부모의 역할로 사용(upcasting)
* 추상메소드와 final static 상수만 올 수 있다.
* 구현메소드를 가질 수 없다.
* */