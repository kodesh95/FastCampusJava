package fc.java.course2.part1;
/**
 * StringMainpulation
 * : String method 종류
 * * length()
 * * charAt(index)
 * * replaceAll("a","b") : a를 b로 바꿔서 반환
 * * index("a") : a의 위치를 반환 (a가 없다면 -1을 반환한다)
 * * toUpperCase() : 대문자로 바꿔서 반환
 * * toLowerCase() : 소문자로 바꿔서 반환
 * * substring(n) : n index에서 끝까지 가져오기
 * *  + substring(1,n) : 1자리에서 n-1자리까지 가져오기
 * @author comet
 * @version 17
 * date of preparation 2023-08-26
 * time 오전 9:36
**/
public class StringMainpulation {
    public static void main(String[] args) {
        String str1 = "I'am baby";
        String str2 = new String("Hello World");

        System.out.println(str2.charAt(1));
        System.out.println(str1.replaceAll("b" , "x"));
        //문자열로 비교를 해야함 -> ("" , "")
        System.out.println(str2.length());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str2.substring(6));
        System.out.println(str2.substring(6,9));
        System.out.println(str2.indexOf("Hel")); //첫번째 인덱스의 값이 반환된다.

        for (int i = 0; i < str2.length(); i++) {
            System.out.println(str2.charAt(i));
        }


    }
}


/* String method 종류
* length()
* charAt(index)
* replaceAll("a","b") : a를 b로 바꿔서 반환
* index("a") : a의 위치를 반환 (a가 없다면 -1을 반환한다)
* toUpperCase() : 대문자로 바꿔서 반환
* toLowerCase() : 소문자로 바꿔서 반환
* substring(n) : n index에서 끝까지 가져오기
*  + substring(1,n) : 1자리에서 n-1자리까지 가져오기
* */