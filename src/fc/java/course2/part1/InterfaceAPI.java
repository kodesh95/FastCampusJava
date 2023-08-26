package fc.java.course2.part1;

import fc.java.course2.model.*;

/**
 * InterfaceAPI
 * : CC를 통해서 BB를 동작시키는 프로그래밍
 * => 인터페이스 기반의 프로그래밍
 * @author comet
 * @version 17
 * date of preparation 2023-08-26
 * time 오후 9:41
**/
public class InterfaceAPI {
    public static void main(String[] args) {
        CC c = new BB();
        c.x(); //BB의 x()가 동작 -> 동적바인딩
        c.y(); //BB의 y()가 동작 -> 동적바인딩
        c.z(); //BB의 z()가 동작 -> 동적바인딩
    }
}
