package fc.java.course1.part3;

import fc.java.course1.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {

        MovieVO vo = new MovieVO("avarta", 20221223, "jake", "action", 192.0f, 12);

        System.out.println(vo);
        System.out.println(vo.getLevel());


    }
}
