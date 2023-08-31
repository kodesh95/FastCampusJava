package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model2.Member;

public class GsonToJson {
    public static void main(String[] args) {

        Member mvo = new Member("홍길동", 10, "hong@gamil.com");
        // Json : {"name" : "홍길동" , ...}

        Gson gson = new Gson();

        String json = gson.toJson(mvo);
        System.out.println("json = " + json);

    }

}
