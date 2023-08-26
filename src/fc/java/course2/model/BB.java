package fc.java.course2.model;
/**
 * BB
 * : 노출시키지 않는다는 것
 *  == .java는 제공하지 않고 .class만 제공
 * @author comet
 * @version 17
 * date of preparation 2023-08-26
 * time 오후 9:37
**/
public class BB implements CC {
    @Override
    public void x() {

        System.out.println("x동작이 실행.");
    }

    @Override
    public void y() {

        System.out.println("y동작이 실행.");
    }

    @Override
    public void z() {

        System.out.println("z동작이 실행.");
    }
}
