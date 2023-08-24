package fc.java.course2.part1;

import fc.java.course2.model.Book;

import java.util.ArrayList;
/**
 * ArrayListTest
 * : 기본 API인 ArrayList를 사용해보자
 * @author comet
 * @version 17
 * date of preparation 2023-08-24
 * time 오전 9:50
**/
public class ArrayListTest {
    public static void main(String[] args) {
//        book 3권을 배열에 저장하고 출력하기
//        Book[], Object[]
//        ArrayList=ObjectArray

        ArrayList list =new ArrayList(1); //default : 10  | Object 타입
//      List list = new ArrayList(); 라고 해도 된다.
        list.add(new Book("java",15000,"한빛","홍길동"));
        list.add(new Book("python",20000,"한빛","가길동"));
        list.add(new Book("C",18000,"한빛","나길동"));

        System.out.println(list.get(0));
//        list.get(0) 은 Book[]의 객체인 elements[0]를 출력
//        elements[0]는 Book의 한 객체와 같으니까 elements[0]을 출력하면
//        elements[0](.toString)이 출력된다.
//        즉 list.get(0)은 toString()를 호출한다.


        Book vo = (Book) list.get(0); // ArrayList의 각 배열의 타입은
        System.out.println(vo);       // Object

        vo = (Book) list.get(1);
        System.out.println(vo);

        vo = (Book) list.get(2);
        System.out.println(vo);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
//            Object -> Book (JVM에서 자동으로 Book의 toString() 호출)
        }
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