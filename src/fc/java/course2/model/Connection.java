package fc.java.course2.model;
// 자바에서 제공하는 인터페이스
public interface Connection {
    //DB연결 동작
    public void getConnection(String url, String username, String password);

}
