package fc.java.course2.part2;

import fc.java.course2.model.Converter;
import fc.java.course2.model.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {
//        StringUtils의 메소드 reverse는 static이 아니므로
//        StringUtils의 객체를 생성 후 그 객체를 참조하도록 할 수 있다.
        StringUtils stringUtils = new StringUtils();
        Converter<String ,String> converter= stringUtils :: reverse;

        String result = converter.convert("hello");
        System.out.println(result);


    }
}
