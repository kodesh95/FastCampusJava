package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();

        System.out.println(vo.getPhone());
        System.out.println(vo.getAge());
        System.out.println(vo.getName());



    }

}
