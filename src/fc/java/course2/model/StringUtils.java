package fc.java.course2.model;

public class StringUtils {
//    인스턴스 메소드 (static X)
    public String reverse(String s) {

        return new StringBuilder(s).reverse().toString();
    }
}
