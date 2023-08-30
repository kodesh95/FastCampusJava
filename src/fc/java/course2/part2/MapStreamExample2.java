package fc.java.course2.part2;

import java.util.*;
import java.util.stream.Collectors;

public class MapStreamExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry","orange");

        List<String> uppercase = words.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("대문자로 변환 : " + uppercase);

        int i=0;
        for (String s : uppercase) {
            System.out.printf("%s = %s%n", words.get(i), s);
            i++;
        }//for

    }//main

}
