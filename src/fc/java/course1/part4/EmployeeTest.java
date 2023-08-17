package fc.java.course1.part4;

public class EmployeeTest {
    public static void main(String[] args) {
//        일반사원 한 명의 객체 생성 후 데이터 저장 후 출력
//        RempVO vo = new RempVO();

//        자식이 부모의 기억공간에 초기화를 하는 경우
//        vo.name="홍길동";
//        vo.age=22;
//        vo.phone="010-1111-1111";
//        vo.empDate="2023-10-11";
//        vo.dept="marketing";
//        vo.marriage=true;
//
//        System.out.println("vo.name = " + vo.name);
//        System.out.println("vo.name = " + vo.age);
//        System.out.println("vo.name = " + vo.phone);
//        System.out.println("vo.name = " + vo.empDate);
//        System.out.println("vo.name = " + vo.dept);
//        System.out.println("vo.name = " + vo.marriage);
//        System.out.println(vo);

//        부모에게 초기화를 부탁하는 경우

        RempVO vo = new RempVO("홍길동",55,"010-1111-1111","2022-02-10","marketing",true);
        System.out.println(vo);
    }
}
