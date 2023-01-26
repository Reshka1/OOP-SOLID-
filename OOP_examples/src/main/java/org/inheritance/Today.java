package org.inheritance;

public class Today {

    public static void main(String args[]){
        Dog pitch = new Dog();
        pitch.sleep();
        pitch.eat();
        pitch.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.scratch();
    }
}
