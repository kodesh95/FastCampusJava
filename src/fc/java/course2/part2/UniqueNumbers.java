package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2, 4, 6, 7, 1, 3};

        Set<Integer> uniqueNums = new HashSet<Integer>();

        for (int number : nums)
            uniqueNums.add(number); //auto-boxing (new Integer(number))

        System.out.println("_____unique numbers_____");
        for (int number : uniqueNums) //auto-nuboxing (uniqueNums.intValue())
            System.out.println(number);
    }
}
