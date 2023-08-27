package fc.java.course2.part2;

import fc.java.course2.model.MovieDTO;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
        list.add(new MovieDTO("괴물", "봉준호", "2006", "한국"));
        list.add(new MovieDTO("기생충", "봉준호", "2019", "한국"));
        list.add(new MovieDTO("완벽한 타인", "이재규", "2018", "한국"));

        for (MovieDTO movie : list)
            System.out.println(movie.toString());

        System.out.println("+------------------+----------+-------+--------+");
        System.out.println("| 영화 제목          |   감독   |개봉년도 |  국가  |");
        System.out.println("+------------------+----------+-------+--------+");

        for (MovieDTO movie : list)
            System.out.printf("| %-16s | %-8s | %4s | %-6s |\n",
                    movie.getTitle(), movie.getDirector(),
                    movie.getYear(), movie.getCountry());
        System.out.println("+------------------+----------+-------+--------+");

        //검색
        String searchTitle="기생충";

        for (MovieDTO movie:list){
            if (movie.getTitle().equals(searchTitle)) {
                System.out.println(movie);
                break;
            }

        }

    }

}
