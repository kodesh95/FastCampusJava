package fc.java.part2;

public class VDATest {
    public static void main(String[] args) {
        int a;
        a = 10;
        System.out.println("a = " + a);

        int b = a;
        int c = b * 10;
        System.out.println("c = " + c);

        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        System.out.println("sum = " + sum);

//        x와 y의 값을 서로 교환하기
        int x = 10;
        int y = 20;
        System.out.println("x = " + x + " : " + "y = " + y);
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + " : " + "y = " + y);
    }
}
