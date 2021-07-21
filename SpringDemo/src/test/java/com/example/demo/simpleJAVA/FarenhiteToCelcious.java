package com.example.demo.simpleJAVA;

import java.util.Scanner;

public class FarenhiteToCelcious {

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        {
            System.out.println("Enter your Farenhite");
            double farenhite=input.nextDouble();
            //conversion
            double celcious=(5.0/9)*(farenhite-32);
            System.out.println("This is the out pur for Farenhite"+celcious);
        }
    }
}
