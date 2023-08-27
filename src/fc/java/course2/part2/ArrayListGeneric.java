package fc.java.course2.part2;

import fc.java.course2.model.MovieDTO;

import java.util.*;

public class ArrayListGeneric {
    public static void main(String[] args) {
//        List list= new ArrayList();
//
//        list.add(new MovieDTO("괴물", "봉준호", "2006", "한국"));
//        list.add("Hello");
//        --> 한 배열 안에 여러가지 타입이 들어가게 된다. (안정성 보장x)

        List<MovieDTO> list = new ArrayList<>(4);

        list.add(new MovieDTO("괴물", "봉준호", "2006", "한국"));
        list.add(new MovieDTO("기생충", "봉준호", "2019", "한국"));

        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }
}
