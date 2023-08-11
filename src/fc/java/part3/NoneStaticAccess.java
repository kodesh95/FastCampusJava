package fc.java.part3;

import fc.java.model.MyUtil;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        MyUtil my = new MyUtil();
        int sum=my.sum(a,b);

        System.out.println("sum = " + sum);
    }
}
