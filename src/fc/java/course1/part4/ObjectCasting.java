package fc.java.course1.part4;

import fc.java.course1.model.*;
public class ObjectCasting {

    public static void main(String[] args) {

        Animal ani = new Dog();
        ani.eat();

        ani=new Cat(); //upcasting
        ani.eat();
//        ani.night(); //downcasting

        Cat cat =(Cat) ani;
        cat.flex();
    }
}
