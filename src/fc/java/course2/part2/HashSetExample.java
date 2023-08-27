package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("apple"); // 중복된 것은 추가되지 않음

        int size = set.size();
        System.out.println("size = " + size);

        for (String element : set)
            System.out.println(element);

        set.remove("banana");

        System.out.println("------banana를 삭제함------");
        for (String element : set)
            System.out.println(element);

        System.out.println("-------------------------");
        boolean contains=set.contains("cherry");
        System.out.println("Set contains cherry? " + contains);

        System.out.println("-------------------------");
        set.clear();
        boolean empty = set.isEmpty();
        System.out.println("Set is empty? " + empty);


    }
}
