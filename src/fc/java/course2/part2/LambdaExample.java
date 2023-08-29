package fc.java.course2.part2;

import fc.java.course2.model.MathOperation;

/**
 * LambdaExample
 * : 람다식을 이용하여 코드를 간결하게 만들어보자
 * @author comet
 * @version 17
 * date of preparation 2023-08-29
 * time 오후 4:48
**/
public class LambdaExample {
    public static void main(String[] args) {
/*      익명 클래스를 사용한 방법
        MathOperation add = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
        int result = add.operation(10,20);
        System.out.println(result); // 10+20 = 30
        */

//        람다식을 사용한 방법
        MathOperation add = (x,y) -> x+y;
        int result = add.operation(29, 49);
        System.out.println("addition = " + result);
    }
}
