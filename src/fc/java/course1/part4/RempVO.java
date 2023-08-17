package fc.java.course1.part4;

/**
 * RempVO
 * : 사원 VO
 * @author comet
 * @version 17
 * date of preparation 2023-08-12
 * time 오전 8:27
**/
public class RempVO extends Employee {
//    부모의 생성자에서 초기화하는 것이 바람직하다.
    public RempVO() {

        super();
    }

    public RempVO(String name,int age,String phone,String empDate,String dept,boolean marriage) {
//        자식이 부모의 기억공간에 초기화를 하는 경우
//        this.name=name;
//        this.age=age;
//        this.phone=phone;
//        this.empDate=empDate;
//        this.dept=dept;
//        this.marriage=marriage;

//        부모에게 초기화를 부탁하는 경우
        super(name, age, phone, empDate, dept, marriage);

    }
}
