package fc.java.course1.part2;

public class Overloading {
//    매개변수의 개수 / 매개변수의 데이터 타입을 다르게 한다.
    public static void main(String[] args) {
        float result1 = add(35.2f,69.35f);
        System.out.println("result1 = " + result1);
        int result2 = add(4,2);
        System.out.println("result2 = " + result2);

    }

    static int add(int a,int b) {
        int sum= a+b;
        return a+b;
    }

    static float add(float a, float b) {
        float sum=a+b;
        return a+b;
    }
}
/*
* 정적 바인딩
* 컴파일 시점에서 메소드 명을 바꿔서 저장(결정/연결)하기 때문에
* 메소드 명이 동일한 메소드들을 중복으로 사용해도
* search 하는 속도가 느려지지 않는다.
* */