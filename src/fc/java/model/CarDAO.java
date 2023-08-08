package fc.java.model;

public class CarDAO {
//    C . R . U . D
//    create = insert
    public void carInsert(CarDTO car) {
        // DB연결, insert SQL
        System.out.println("car 저장됨");
    }
    public void carSelect() {
        // DB연견, select SQL
        System.out.println("car 출력됨");
    }
}
