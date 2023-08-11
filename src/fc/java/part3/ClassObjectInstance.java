package fc.java.part3;

import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1; // st1: 객체변수
        Student st2; // st2: 객체변수
        Student st3; // st3: 객체변수

        st1=new Student("최지은", "it금융학과", 25,
                "comet7789@jj.ac.kr",
                3, "010-1111-1111"); // st1: 인스턴스
        st2=new Student("최레오", "it금융학과", 25,
                "comet7789@jj.ac.kr",
                3, "010-2222-2222"); // st2: 인스턴스
        st3=new Student("최리오", "it금융학과", 25,
                "comet7789@jj.ac.kr",
                3, "010-3333-3333"); // st3: 인스턴스
        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());

    }
}
