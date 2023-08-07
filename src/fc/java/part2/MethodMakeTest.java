package fc.java.part2;

public class MethodMakeTest {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int sum=a+b;
        System.out.println("sum = " + sum);
        int result = totalSum(a,b);
        System.out.println("result = " + result);
    }

    static int totalSum(int a, int b) {
        return a+b;
    }

}
