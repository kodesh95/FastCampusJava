package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str="Hello, World";
        Map<Character,Integer> charCounterMap= new HashMap<>();

        char[] strArray = str.toCharArray(); // {'H','E', ...}

        for (char c :strArray) {
            if (charCounterMap.containsKey(c))
                charCounterMap.put(c, charCounterMap.get(c) + 1);
            else
                charCounterMap.put(c, 1);
        }

        for (char c:charCounterMap.keySet()) {
            System.out.println(c+" : "+charCounterMap.get(c));
        }

    }

}
