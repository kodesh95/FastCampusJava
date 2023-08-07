public class ApiOverloading {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10.3f);
        System.out.println('A');
        System.out.println("apple");
//        println 으로 overloading 메소드가 생성되어있다.

        int max= maxValue(8,12);
        System.out.println("max = " + max);

        int min = minValue(2,6);
        System.out.println("min = " + min);
    }
    //    두 정수 중 더 큰 수를 리턴하는 메소드를 정의하시오.
    static int maxValue(int a, int b) {

        return (a>b) ? a: b;

    }
    //    두 정수 중 더 작은 수를 리턴하는 메소드를 정의하시오.
    static int minValue(int a, int b) {

        return (a<b) ? a : b;
    }

}
