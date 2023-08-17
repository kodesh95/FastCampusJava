package fc.java.course1.model;

public class AllStatic {
//      생성자를 private 으로 하면 나머지 모든 멤버를 static 으로 해야한다.
//      객체를 생성하지 말고 그냥 class.메소드 형태로 사용해
//    자주 사용하니까
    private AllStatic() {

    }
    public static int hap(int a, int b) {
        int v = a + b;
        return v;
    }

    public static int max(int a, int b) {

        return a > b ? a : b;
    }

    public static int min(int a, int b) {

        return a < b ? a : b;
    }
}
