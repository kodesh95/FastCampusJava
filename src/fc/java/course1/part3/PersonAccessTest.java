package fc.java.course1.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
//        Person 클래스에 이름,나이,전화번호를 저장하고 출력하세요.
        Person p = new Person();

        p.name="hong";
        p.age=1000;
        p.phone="01024033333";

        System.out.println("p.name = " + p.name);
        System.out.println("p.age = " + p.age);
        System.out.println("phone = " + p.phone);
    }
}
