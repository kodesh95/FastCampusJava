package fc.java.course2.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * SortCompareTest
 * : 자바의 기본 클래스의 인스턴스 메소드 참조 (클래스명 :: 메소드명)
 * @author comet
 * @version 17
 * date of preparation 2023-08-29
 * time 오후 4:24
**/
public class SortCompareTest {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("최지은","이혜인","박매일");

//        String의 문자열 비교하는 메소드 참조
        Collections.sort(names,String::compareTo);

        System.out.println(names);

        for (String name : names)
            System.out.println(name);

    }
}
