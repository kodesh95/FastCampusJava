package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.course2.model.Person;

public class GsonFromAPI {
    public static void main(String[] args) {
//json을 자바 객체로 변환
        String json = "{\"name\":\"Choi\",\"age\":27}";
        Gson gson = new Gson();

        Person person = gson.fromJson(json,Person.class);

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person);

    }

}
