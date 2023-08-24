package fc.java.course2.part1;

import fc.java.course2.model.Book;

import java.util.ArrayList;

public class ArrayListBestTest {
    public static void main(String[] args) {


        ArrayList<Book> list = new ArrayList<Book>();
//        <Book> Book 타입의 원소만 받을 수 있다.

        list.add(new Book("java",15000,"한빛","홍길동"));
        list.add(new Book("python",20000,"한빛","가길동"));
        list.add(new Book("C",18000,"한빛","나길동"));


        Book vo = list.get(0);
        System.out.println(vo);

        /*
        * ArrayListTest.java 에서는 Book vo = (Book) list.get(0) downcasting
        * 그러나 <> generic을 사용해서 ArrayList를 한정해주면
        * 원하는 타입의 원소만을 받을 수 있게되고
        * downcasting 할 필요가 없어진다.
        * */

        vo = list.get(1);
        System.out.println(vo);

        vo = list.get(2);
        System.out.println(vo);


    }
}
