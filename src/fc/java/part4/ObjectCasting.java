package fc.java.part4;

import fc.java.model.*;
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
