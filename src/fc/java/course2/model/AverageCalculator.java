package fc.java.course2.model;

public class AverageCalculator<T extends Number> {
    private T[] numbers;

    public AverageCalculator(T[] numbers) {
        this.numbers = numbers;
    }

    public double calculatorAverage() {
        double sum=0.0;

        for (T num:numbers) {
            sum+=num.doubleValue();
        }
        return sum/ numbers.length;
    }


}
