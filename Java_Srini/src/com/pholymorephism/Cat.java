package com.pholymorephism;

public class Cat implements Animal{



    @Override
    public String sound() {
        return "Meaw";
    }

    @Override
    public String sound(int a, int b) {

        int result= a+b;
        return Integer.toString(result);
    }
}
