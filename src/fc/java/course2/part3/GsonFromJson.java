package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model2.Member;

public class GsonFromJson {
    public static void main(String[] args) {

        String json = "{\"name\":\"홍길동\",\"age\":10,\"email\":\"hong@gamil.com\"}";

        Gson gson = new Gson();
        Member mvo = gson.fromJson(json, Member.class);
        System.out.println("mvo = " + mvo); //mvo.toString()


    }
}
