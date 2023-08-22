package fc.java.course2.model;
/**
 * Book
 * : 잘 설계된 DTO VO
 * @author comet
 * @version 17
 * date of preparation 2023-08-22
 * time 오전 9:43
**/
public class Book {
//    멤버변수, 상태정보, 속성(property)
    private String title;
    private int price;
    private String company;
    private String author;

//    default 생성자
    public Book() {
    }
//    생성자메소드의 overloading : 오버로딩에서의 다형성은 메소드가 여러개가 동작한다.
    public Book(String title, int price, String company, String author) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.author = author;
    }
//    setter, getter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    toString (부모 클래스인 object의 toString을 재정의override)
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
