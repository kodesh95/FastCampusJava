package fc.java.course2.part2;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str1="123";
        String str2 = "123";
        System.out.println(str1+str2); // 결합의 덧셈

        int num = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println("123 + 123 = " + num);

        int n1 = 123;
        int n2 = 123;

        String str3 = String.valueOf(n1) + String.valueOf(n2);
        System.out.println("\"123\" + \"123\"= " + str3);

        String str4 = n1 + "" + n2;
        System.out.println(str4);
    }
}
