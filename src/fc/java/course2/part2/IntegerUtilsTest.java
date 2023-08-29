package fc.java.course2.part2;

import fc.java.course2.model.*;
/**
 * IntegerUtilsTest
 * : 함수형 인터페이스의 정적 메소드 참조 ( 클래스명 :: 메소드명 )
 * @author comet
 * @version 17
 * date of preparation 2023-08-29
 * time 오후 4:02
**/
public class IntegerUtilsTest {
    public static void main(String[] args) {
        Converter<String,Integer> converter = IntegerUtils :: stringToInt;
//        함수형 인터페이스는 IntegerUtils의 메소드 stringToInt를 참조할 거야

        Integer result = converter.convert("123");
        System.out.println(result);
    }
}
