package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        Student[] st = new Student[4];
        st[0]=new Student("홍길동","컴공",33,"abc@asdf.com",20211111,"010-1111-1111");
        st[1]=new Student("가길동","전기",26,"def@asdf.com",20212222,"010-2222-2222");
        st[2]=new Student("나길동","토목",15,"ghi@asdf.com",20213333,"010-3333-3333");
        st[3]=new Student("다길동","통신",37,"jkl@asdf.com",20214444,"010-4444-4444");

        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i].toString());
        }

        for (Student std: st) {
            System.out.println(std);
        }

    }
}
