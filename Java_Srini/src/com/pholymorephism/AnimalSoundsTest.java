package com.pholymorephism;

public class AnimalSoundsTest {

    public static void main(String[] args) {
        Cat cat1=new Cat();
        Dog dog1=new Dog();




        System.out.println( "Cat sound like this " +cat1.sound());
        System.out.println("Calculation of cat " +cat1.sound(200,100));
        System.out.println("\n");
        System.out.println("Dog sound like this " + dog1.sound());
        System.out.println("Calculation of cat " +dog1.sound(50,50));

    }
}
