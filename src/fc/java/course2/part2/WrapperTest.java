package fc.java.course2.part2;
/**
 * WrapperTest
 * : wrapper class
 * @author comet
 * @version 17
 * date of preparation 2023-08-27
 * time 오전 7:19
**/
public class WrapperTest {
    public static void main(String[] args) {

        int a = 10;
//       (x) Integer aa = new Integer(10); 사용자 정의 자료형
        Integer aa = 10; // auto-boxing
        System.out.println(aa.intValue()); // unboxing (Integer -> int)


//       (x) Integer bb = new Integer(20);
        Integer bb = 20; // auto-boxing
        int b =bb; // auto-unboxing (bb.intValue() 생략됨)
        System.out.println(b);


        float f = 10.4f;
//       (x) Float ff = new Float(10.5);
        Float ff = 10.5f; // auto-boxing
        System.out.println(ff.floatValue()); // unboxing


        Float af = 92.1f;
        System.out.println(af.floatValue());
        float aff = af; // auto-unboxing (af.floatValue() 생략됨)

    }
}
