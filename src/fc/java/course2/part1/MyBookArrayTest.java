package fc.java.course2.part1;

import fc.java.course2.model.Book;
import fc.java.course2.model.BookArray;

public class MyBookArrayTest {
//    책 3권의 데이터를 배열에 저장하고 출력하라
    public static void main(String[] args) {
        BookArray list = new BookArray();

        list.add(new Book("java",15000,"한빛","홍길동"));
        list.add(new Book("python",20000,"한빛","가길동"));
        list.add(new Book("C",18000,"한빛","나길동"));

//        vo 는 Book의 객체니까 vo.toString을 하면 Book의 정보가 모두 출력
//        list.get(0) 은 Book[]의 객체인 elements[0]를 출력
//        elements[0]는 Book의 한 객체와 같으니까 elements[0]을 출력하면
//        elements[0](.toString)이 출력된다.
//        즉 list.get(0)은 toString()를 호출한다.
        Book vo = list.get(0);
        System.out.println(vo); // toString
        System.out.println(list.get(1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
