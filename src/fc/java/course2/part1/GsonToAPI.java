package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.course2.model.Person;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person = new Person("Choi", 27);
//자바 객체를 json으로 변환
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("json = " + json);
//        JSON(JavaScript Object Notation) : {"name":"Choi","age":27}
//        객체를 일종의 문자열로 변환



    }
}
