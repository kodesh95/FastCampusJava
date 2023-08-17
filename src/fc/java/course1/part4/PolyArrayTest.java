package fc.java.course1.part4;

import fc.java.course1.model.*;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

//        Animal[] ani = {new Dog(),new Cat()};
        Animal[] ani = new Animal[2];
        ani[0] = d;
        ani[1] = c;
        display(ani);


//        ani[0].eat();
//        ani[1].eat();
//        ((Cat) ani[1]).flex();
    }

    public static void display(Animal[] ani) {
        for (int i = 0; i < ani.length; i++) {
            ani[i].eat();

            if (ani[i] instanceof Cat)
                ((Cat) ani[i]).flex();
        }
    }
}
