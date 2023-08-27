package fc.java.course2.part2;

import java.util.ArrayList;
/**
 * ListExample
 * : 중복이 가능하고 순서도 있다
 * @author comet
 * @version 17
 * date of preparation 2023-08-27
 * time 오후 2:36
**/
public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();

        list.add("apple"); // list.add(new String("apple"))
        list.add("banana");
        list.add("cherry");
        list.add("banana");



        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(list.size()-1));

        list.remove(0);
        list.set(0,"orange");

        for (String s : list)
            System.out.println(s);
    }
}
