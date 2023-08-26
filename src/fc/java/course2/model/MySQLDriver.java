package fc.java.course2.model;

public class MySQLDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {

        System.out.println("mysql DB에 접속을 시도한다.");
    }
}
