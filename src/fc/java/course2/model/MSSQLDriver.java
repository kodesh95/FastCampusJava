package fc.java.course2.model;

public class MSSQLDriver implements Connection{

    @Override
    public void getConnection(String url, String username, String password) {

        System.out.println("mssql DB에 접속을 시도한다.");
    }
}
