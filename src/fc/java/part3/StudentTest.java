package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
//        정수 6개를 저장할 배열을 생성하라
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 24;
        arr[3] = 53;
        arr[4] = 42;
        arr[5] = 46;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        Student st = new Student("최지은", "it금융학과", 25,
                "comet7789@jj.ac.kr",
                3, "010-2432-5342");

        System.out.println(st);

    }


}
