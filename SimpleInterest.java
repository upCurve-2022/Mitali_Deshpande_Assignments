package com.company;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Principle amt.:");
        double p = myObj.nextDouble();
        System.out.println("Enter Rate of Interest:");
        double r = myObj.nextDouble();
        System.out.println("Enter Time:");
        double t = myObj.nextDouble();

        double si;
        si=((p*r*t)/100);

        System.out.println("Simple Interest Is:"+si);
        // write your code here
    }
}
