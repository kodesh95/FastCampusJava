package fc.java.course2.part2;

import fc.java.course2.model.MathOperation;

/**
 * FunctionInterfaceTest2
 * : MathOperation 인터페이스를 내부 익명클래스로 구현하기
 * @author comet
 * @version 17
 * date of preparation 2023-08-28
 * time 오후 1:25
**/
public class FunctionInterfaceTest2 {
    public static void main(String[] args) {
        MathOperation op = new MathOperation() {

            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };

        int result = op.operation(10, 30);
        System.out.println("result = " + result);
        /*
        * 클래스는 존재하지만 이름이 없다. 파일로 만들어져 있지 않다.
        * 내부에서만 존재하는 익명 내부 클래스이다.
        * */
        
        
        
    }
}
