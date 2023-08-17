package fc.java.course1.part4;

import fc.java.course1.poly.*;

public class ObjectPolyArray {
    public static void main(String[] args) {
//        A,B 클래스를 저장할 배열 생성
        Object[] obj = new Object[2];

        obj[0] = new A(); // upcasting
        ((A) obj[0]).printGo(); // downcasting

        obj[1] = new B(); // upcasting
        ((B) obj[1]).printGo(); // downcasting

        display(obj);

    }

    public static void display(Object[] obj) {
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof A)
                ((A) obj[i]).printGo();
            else ((B) obj[i]).printGo();

        }
    }
}
