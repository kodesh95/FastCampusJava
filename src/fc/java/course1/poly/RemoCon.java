package fc.java.course1.poly;

public interface RemoCon {
//    interface는 묵시적으로 abstract가 된 상태이다.
    public void chUp();
    public void chDown();
    public void volUp();
    public void volDown();
    //    구현메소드는 서로 동작방식이 비슷한 클래스를 상속관계로 만들어서 동작시킬 때
    public void internet(); //{
//        System.out.println("인터넷이 된다.");
//    } --> 오류가 난다.
}

// 부모클래스에는 interface
// 자식클래스에는 implements