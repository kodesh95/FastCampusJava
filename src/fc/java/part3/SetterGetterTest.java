package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();

        vo.setName("choi");
        vo.setAge(40);
        vo.setPhone("010-1234-1234");
        System.out.println(vo.getName());
        System.out.println(vo.getAge());
        System.out.println(vo.getPhone());


    }
}
