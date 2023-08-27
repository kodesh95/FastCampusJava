package fc.java.course2.part2;

import fc.java.course2.model.AverageCalculator;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5};
        Double[] doubles={1.0,2.0,3.0,4.0,5.0};

        AverageCalculator<Integer> integerAverageCalculator = new AverageCalculator<>(integers);
        double integeraverage = integerAverageCalculator.calculatorAverage();
        System.out.println(integeraverage);

        AverageCalculator<Double> doubleAverageCalculator = new AverageCalculator<>(doubles);
        double doubleaverage = doubleAverageCalculator.calculatorAverage();
        System.out.println(doubleaverage);
    }
}
