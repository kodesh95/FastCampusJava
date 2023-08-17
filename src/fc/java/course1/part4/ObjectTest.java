package fc.java.course1.part4;

import fc.java.course1.poly.A;

public class ObjectTest {
    public static void main(String[] args) {
//        객체 A 생성 (upcasting)
        Object a = new A();
//        downcasting
        ((A)a).display();
    }
}
