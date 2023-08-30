package fc.java.course2.part2;

import java.util.*;
import java.util.function.Predicate;

public class StreamExample {

    public static boolean isEven(int number) {
        return number%2==0;

    }
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> isEven = n -> n % 2 ==0;
        // numbers 는 이미 Arrays를 참조하고 있으므로
        // Arrays.stream(numbers)


        // isEven 안에 test()있는데
        // 이미 numbers가 stream으로 변환이 돼서
        // filter(isEven.test()) 가 올 수 없다.
        int sumOfSquares= numbers.stream()
                .filter(isEven) // .filter(n->n%2==0)
            //  .filter(StreamExample::isEven)
                .sorted()
                .map(n -> n*n)
                .reduce(0,Integer::sum);

        System.out.println("sumOfSquares = " + sumOfSquares);
    }
}
