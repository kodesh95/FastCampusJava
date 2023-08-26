package fc.java.course2.part1;

/**
 * StringCompare
 * : 문자열 비교
 * 기준.equals(비교대상) - 같으면 true, 다르면 false
 * 기준.compareTo(비교대상) - 문자열을 사전순으로 하나씩 비교하여 같으면 0,
 * 기준이 비교대상보다 크면 양수 작으면 음수를 반환한다.
 *
 * @author comet
 * @version 17
 * date of preparation 2023-08-26
 * time 오전 9:37
 **/
public class StringCompare {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        if (str1.equals(str2))
            System.out.println("str1 == str2");
        else System.out.println("str1 != str2");


        String str3 = "apple";
        String str4 = "banana";

        int result = str3.compareTo(str4);

        if (result==0)
            System.out.println("str3 == str4");
        else if (result<0)
            System.out.println("str3 < str4");
        else System.out.println("str3 < str4");
    }
}
