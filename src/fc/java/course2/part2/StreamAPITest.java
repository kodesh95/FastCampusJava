package fc.java.course2.part2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

/*        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 ==0)
                even+=nums[i];
        }//
        System.out.println("even = " + even);*/

//        IntStream stream = Arrays.stream(nums);
        int sumOfEvens = Arrays.stream(nums)
                .filter(n -> n % 2 == 0) // 람다식
                .sum();
        System.out.println("sumOfEvens = " + sumOfEvens);

        int[] evenNumbers = Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .toArray();

        for (int even : evenNumbers)
            System.out.println("even = " + even);


    }
}
