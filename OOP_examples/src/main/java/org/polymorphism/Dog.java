package org.polymorphism;

public class Dog extends Anumal{
    @Override
    public void sleep(String how) {
        super.sleep("loudly");
    }
}
