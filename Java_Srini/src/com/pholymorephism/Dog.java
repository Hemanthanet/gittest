package com.pholymorephism;

public class Dog implements Animal{


    @Override
    public String sound() {
        return "Baw";
    }

    public String sound(int x,int y )
    {

         int result= x+y;
         return  Integer.toString(result);

    }
}
