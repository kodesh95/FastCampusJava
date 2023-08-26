package fc.java.course2.model;
//오라클 회사에서 만들어서 제공 (Driver)
public class OracleDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {

        System.out.println("oracle DB에 접속을 시도한다.");
    }
}
