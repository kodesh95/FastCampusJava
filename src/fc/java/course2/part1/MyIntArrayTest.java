package fc.java.course2.part1;

import fc.java.course2.model.*;

public class MyIntArrayTest {
    public static void main(String[] args) {
        IntArray list=new IntArray();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
