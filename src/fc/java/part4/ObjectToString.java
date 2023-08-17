package fc.java.part4;

import fc.java.poly.B;
import fc.java.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b = new Board();
        b.setTitle("게시글입니다.");
        System.out.println(b.getTitle());
        System.out.println(b.toString());   // fc.java.poly.Board@3b07d329
//        -> override 된 결과가 출력된다.
    }
}
