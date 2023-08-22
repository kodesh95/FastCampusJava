package fc.java.course2.part1;

import fc.java.course2.model.A;
import fc.java.course2.model.B;
import fc.java.course2.model.C;
import fc.java.course2.model.ObjectArray;

public class MyObjectArrayTest {
    public static void main(String[] args) {
//        A B C 객체를 배열에 저장하고 출력하기
        ObjectArray list = new ObjectArray();

        list.add(new A()); // upcasting : Object element= new A();
        list.add(new B()); // upcasting : Object element= new B();
        list.add(new C()); // upcasting : Object element= new C();

        A a = (A) list.get(0);
        a.display();

        B b = (B) list.get(1);
        b.display();

        C c = (C) list.get(2);
        c.display();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof A)
                ((A) list.get(i)).display();
            else if (list.get(i) instanceof B)
                ((B) list.get(i)).display();
            else
                ((C) list.get(i)).display();
        }



    }
}
