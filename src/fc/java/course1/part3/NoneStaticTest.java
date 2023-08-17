package fc.java.course1.part3;

import fc.java.course1.model.MyUtil;

public class NoneStaticTest {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        NoneStaticTest no=new NoneStaticTest();
        int sum=no.hap(a,b);
        System.out.println("sum = " + sum);

        MyUtil my = new MyUtil();
        sum = my.sum(a,b);
        System.out.println("sum = " + sum);

    }
    public int hap(int a, int b) {
        int v=a+b;
        return v;
    }
}
