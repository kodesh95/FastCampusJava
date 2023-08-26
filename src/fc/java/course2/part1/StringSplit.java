package fc.java.course2.part1;

import java.util.Scanner;

/**
 * StringSplit
 * : 특정구분자(delimiter) + 공백을 나타내는 정규표현식(\s+)
 * @author comet
 * @version 17
 * date of preparation 2023-08-26
 * time 오전 9:56
**/
public class StringSplit {
    public static void main(String[] args) {

        String str1 = "Hello,World,Java";
        String[] strArray1 = str1.split(",");

        for (String s : strArray1)
            System.out.println(s.toString());

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력 : ");
        String str2 = sc.nextLine();

//        String str2 = "Hello World Java";
        String[] strArray2 = str2.split("\\s+");

        for (String s : strArray2)
            System.out.println(s.toString());
    }
}


/*
 * 변수 자동생성 = ctrl + alt + v
 * 구현부 보기 = ctrl + shift + i
 * 매개변수 자동 완성 = ctrl + alt + p
 * 클래스 검색 = ctrl + n
 * 파일 검색 = ctrl + shift + n
 * 메소드 검색 = ctrl + shift + alt + n
 * 전체 검색 = ctrl + shift + f
 * 최근 파일 = ctrl + e
 * */