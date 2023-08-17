package fc.java.course1.part3;

import fc.java.course1.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();

        System.out.println(vo.getPhone());
        System.out.println(vo.getAge());
        System.out.println(vo.getName());



    }

}
