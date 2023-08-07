package fc.java.part3;

/**
 * PersonTest
 * :
 * @author comet
 * @version 17
 * date of preparation 2023-08-07
 * time 오후 8:53
**/
public class PersonTest {

    public static void main(String[] args) {
//        한 사람의 데이터를 저장할 변수를 선언
        fc.java.part3.Person p; // 같은 디렉토리에 있기에 Person p; 라고 해도 됨
//        p의 메모리 공간이 만들어진다.
//        p는 객체이다.
        p=new Person();
//        p가 Person을 가리킨다
//        인스턴스(실체)를 갖게 된 p, 즉 인스턴스가 됐다.

//        p.name = 가리키고 있는 곳의 name에 접근해라
        p.name="홍길동";
        p.age=30;
        p.phone="010-1111-1111";

        System.out.println("name = " + p.name);
        System.out.println("age = " + p.age);
        System.out.println("phone = " + p.phone);

        p.play();
        p.eat();
        p.walk();


    }

}
/*
 * new Person() 생성자 메소드는 객체를 생성해주는 메소드이다.
 * 그러나 Person class에는 Person() 메소드를 만든 적이 없다.
 * public Person() {
 *
 * }
 * 이 생략되어있는 것이다!!!
 * 그래서 new연산자와 함께 Person() 메소드를 호출하면 객체가 생성되어 인스턴스가 된다.
 * 특징으로 return 타입이 없다!
 * */
