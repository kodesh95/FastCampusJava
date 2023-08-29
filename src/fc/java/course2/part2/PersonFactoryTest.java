package fc.java.course2.part2;

import fc.java.course2.model.Person;
import fc.java.course2.model.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
     /*   PersonFactory personFactory = Person::new;

//        람다표현식을 사용한 방법
        Person person = personFactory.create("홍길동" , 10);
        System.out.println(person);*/
        
//        익명 클래스를 사용한 방법
        PersonFactory personFactory = new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name,age);
            }
        };
        
        Person person=personFactory.create("홍길동",123);
        System.out.println("person = " + person);
        
    }
}
