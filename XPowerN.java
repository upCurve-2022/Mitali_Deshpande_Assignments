package com.company;

import java.util.Scanner;

public class XPowerN {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Number:");
        int X = myObj.nextInt();
        System.out.println("Enter Power:");
        int n = myObj.nextInt();
        int mul=1;
        for(int i=0;i<n;i++)
        {
            mul=mul*X;
        }
        System.out.println("Answer is: "+mul);
	// write your code here
    }
}
