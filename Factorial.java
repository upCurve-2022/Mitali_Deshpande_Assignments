package com.company;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = myObj.nextInt();
        int fac=1;
        for(int i=n;i>0;i--)
        {
            fac=fac*i;// write your code here
        }
        System.out.println("Factorial of "+n+" is: "+fac);


    }
}
