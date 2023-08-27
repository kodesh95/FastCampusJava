package fc.java.course2.part2;

import fc.java.course2.model.Book;
import fc.java.course2.model.MovieDTO;
import fc.java.course2.model.ObjectArr;

public class GenericTest {
    public static void main(String[] args) {
/*        ObjectArr<String> array=new ObjectArr<>(5);

        array.set(0,"hello");
        array.set(1,"world");
        array.set(2,"java");
        array.set(3,"Generic");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));

        }*/

        ObjectArr<MovieDTO> arr = new ObjectArr<>(5);

        arr.set(0,new MovieDTO("괴물", "봉준호", "2006", "한국"));
        arr.set(1,new MovieDTO("기생충", "봉준호", "2019", "한국"));
        arr.set(2,new MovieDTO("완벽한 타인", "이재규", "2018", "한국"));

        for (int i = 0; i < arr.size(); i++) {

            System.out.println(arr.get(i));
        }
    }
}
