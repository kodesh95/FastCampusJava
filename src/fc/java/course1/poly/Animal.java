package fc.java.course1.poly;
/**
 * Animal
 * : 추상클래스의 등장
 * @author comet
 * @version 17
 * date of preparation 2023-08-16
 * time 오후 7:32
**/
public abstract class Animal {

    public abstract void eat();

//        System.out.println("?"); //추상적인 표현이 된다.
//        main() 메소드에서 Animal.eat() 출력되지않기 떄문에 굳이 body 부분이
//        필요할까? 그렇다면 body를 없애도 괜찮지않을까?
//        --> body가 없는 메소드를 추상메소드(불완전 메소드) : 메소드의 구현부 없음
//       abstract 메소드를 가진 클래스는 abstract 클래스가 된다.
//    추상클래스도 불완전한 클래스이다.
//    혼자서는 객체를 생성할 수 없고 자식클래스의 도움을 받아야한다.
/*      Animal ani = new Dog();
            ani.eat(); --> 호출이 불가능하니까 객체생성도 할 수 없다고 생각하자.
*/

    public void move(){
        System.out.println("무리를 지어 이동한다.");
    }
}
