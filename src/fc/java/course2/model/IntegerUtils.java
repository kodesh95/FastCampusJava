package fc.java.course2.model;

public class IntegerUtils {
//    정적 메소드 (static)이라서 객체를 생성하지 않고 클래스명.메소드명으로 사용가능
//    static이 아닌 메소드는 인스턴스(객체를)를 생성해야하므로 인스턴스 메소드라 한다.
    public static int stringToInt(String s) {

        return Integer.parseInt(s); //문자형을 정수형으로
    }
}
