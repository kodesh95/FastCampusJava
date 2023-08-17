package fc.java.course1.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    //    생성자 메소드
//    객체 초기화
    public PersonVO() {
        this.name = "choi";
        this.age = 19;
        this.phone = "010-1221-2456";
    }

    public PersonVO(String name, int age, String phone) {
        this.name=name;
        this.age=age;
        this.phone=phone;
    }

    //    setter method
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //    getter method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String toString() {
        return name+"\t"+age+"\t"+phone;
    }

}
