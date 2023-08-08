package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        PersonVO vo=new PersonVO();
//        vo.age=15000; //정보 은닉이 되지 않았기 때문에 1500해도 아무문제x
//        vo.name="choi leo";
//        vo.phone="010-1811-1111";

        vo.setName("choi");
        vo.setAge(25);
        vo.setPhone("010-1234-1234");

        System.out.println(vo.getName());
        System.out.println(vo.getAge());
        System.out.println(vo.getPhone());
//        System.out.println("vo.name = " + vo.name);
//        System.out.println("vo.phone = " + vo.phone);
//        System.out.println("vo.age = " + vo.age);
    }
}
