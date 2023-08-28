package fc.java.course2.model;
//구현체가 외부에 있는 경우 (비효율적)
public class MathOperationImple implements MathOperation {

    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
