package fc.java.course2.part2;

import fc.java.course2.model.*;

public class FunctionInterfaceTest1 {
    public static void main(String[] args) {
        MathOperation op = new MathOperationImple();

        int result = op.operation(10, 20);
        System.out.println("result = " + result);


    }
}
