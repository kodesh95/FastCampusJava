package fc.java.course2.part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {

        String apiKey = "8ff5896c0582a844043fd8a537d99233";

        String city = "Changde";

        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" +
                apiKey + "&units=metric";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            int responseCode = connection.getResponseCode(); // 200 normal
            if (responseCode == 200) {
                //스트림의 연결
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {

                    content.append(inputLine);
                }
                in.close();
                System.out.println("content = " + content.toString());
                // {  } 이러한 데이터를 받기위함
                JsonObject wearherData = JsonParser.parseString(content.toString()).getAsJsonObject();
                JsonObject mainData = wearherData.getAsJsonObject("main");
                double temp = mainData.get("temp").getAsDouble();

                System.out.println("temp = " + temp);
                connection.disconnect();

            } else {
                //오류


            }

        } catch (Exception e) {
            e.printStackTrace(); //에러메세지 출력
        }

    }

}
