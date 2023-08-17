package fc.java.course1.poly;

public class Cat extends Animal {
//    재정의를 하지 않음(x) --> 오류가 나지않는다.


    @Override
    public void eat() {
        System.out.println("고양이처럼 먹다.");
    }

    public void flex(){

        System.out.println("고양이는 유연하다.");
    }
}
