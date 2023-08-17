package fc.java.course2.part1;

import fc.java.course2.model.*;

public class MinMaxFinderTest {
    public static void main(String[] args) {

        int[] arr = {5,2,9,1,7};

        int min = MinMaxFinder.findMin(arr);
        System.out.println("min = " + min);

        int max = MinMaxFinder.findMax(arr);
        System.out.println("max = " + max);

    }
}
