package fc.java.course1.part3;

import fc.java.course1.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("홍길동",49,"010-1111-111");

        System.out.println(vo.getName());
        System.out.println(vo.getAge());
        System.out.println(vo.getPhone());

        System.out.println(vo.toString());
//        System.out.println(vo);

    }
}
