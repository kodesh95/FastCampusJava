package fc.java.course1.poly;
//상속이 아닌 구현이라고 표현
public class TV implements RemoCon {
    @Override
    public void chUp() {
        System.out.println("TV채널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("TV채널이 내려간다.");

    }

    @Override
    public void volUp() {
        System.out.println("TV소리가 올라간다.");

    }

    @Override
    public void volDown() {
        System.out.println("TV소리가 올라간다.");

    }

    @Override
    public void internet() {
        System.out.println("TV에서 인터넷이 실행됩니다.");
    }
}
