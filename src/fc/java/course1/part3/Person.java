package fc.java.course1.part3;
//object = 상태정보(멤버변수) + 행위정보(멤버메소드)
public class Person {

    public String name;
    public int age;
    public String phone;


    /*
     * new Person() 생성자 메소드는 객체를 생성해주는 메소드이다.
     * 그러나 Person class에는 Person() 메소드를 만든 적이 없다.
     * public Person() {
     *
     * }
     * 이 생략되어있는 것이다!!!
     * 그래서 new연산자와 함께 Person() 메소드를 호출하면 객체가 생성되어 인스턴스가 된다.
     * 특징으로 return 타입이 없다!
     * */



    public void play() {

        System.out.println("운동을 한다.");
    }

    public void eat() {

        System.out.println("음식을 먹는다.");
    }

    public void walk() {

        System.out.println("걷다.");
    }

}

