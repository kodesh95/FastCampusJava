package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> stdScores=new HashMap<>();

        stdScores.put("Kim",98);
        stdScores.put("Park",89);
        stdScores.put("Lee",80);
        stdScores.put("Choi",100);

        System.out.println("Kim's score : " + stdScores.get("Kim"));
        System.out.println("Park's score : " + stdScores.get("Park"));
        System.out.println("Lee's score : " + stdScores.get("Lee"));
        System.out.println("Choi's score : " + stdScores.get("Choi"));

        stdScores.put("Kim",90);
        System.out.println("Kim's score : " + stdScores.get("Kim"));

        stdScores.remove("Kim");
        System.out.println("Kim's score : "+ stdScores.get("Kim")); // null

        for (Map.Entry<String,Integer> entry :stdScores.entrySet())
            System.out.println(entry.getKey() + "'s score:  " + entry.getValue());
    }
}
