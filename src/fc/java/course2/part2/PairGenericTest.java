package fc.java.course2.part2;

import fc.java.course2.model.Pair;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {
        Pair<String , Integer> pair=new Pair<>("hello",1);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());


        //HashMp은 검색을 빠르게 할 수 있는 자료구조
        Map<String,Integer> map= new HashMap<>();
        map.put("kor",95);
        map.put("eng",95);
        map.put("math",99);

        System.out.println(map.get("kor"));
        System.out.println(map.get("eng"));
        System.out.println(map.get("math"));
    }
}
