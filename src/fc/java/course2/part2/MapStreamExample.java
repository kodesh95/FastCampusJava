package fc.java.course2.part2;

import java.util.*;
import java.util.stream.Collectors;

public class MapStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        List<Integer> numbersSquared = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("numbersSquared = " + numbersSquared);


    }
}
