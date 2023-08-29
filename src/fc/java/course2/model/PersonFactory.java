package fc.java.course2.model;
@FunctionalInterface
public interface PersonFactory {
/**
 * create
 * : return type = Person
 *   매개변수로 name,age
**/
    Person create(String name,int age);
}
