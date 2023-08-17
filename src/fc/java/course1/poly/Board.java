package fc.java.course1.poly;

public class Board {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
//  default toString은 객체의 번지를 출력한다.
    @Override
    public String toString() {
        System.out.println(super.toString());  // 상위클래스의 메소드 호출
        return "Board{" +
                "title='" + title + '\'' +
                '}';
    }
}
