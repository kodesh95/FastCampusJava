package fc.java.course1.part4;

import fc.java.course1.poly.A;
import fc.java.course1.poly.B;

public class ObjectPolyArg {
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);


    }
// 다형성 인수 : display(a) , display(b) , ... 끝도 없이 만들어지는 것을 해결!
    private static void display(Object obj) {
        if (obj instanceof A)
            ((A) obj).printGo();
        else ((B) obj).printGo();

    }

}
