package com.company;

import java.util.Scanner;

public class PatternPrintingSecond {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter a number");
        Integer n = myObj.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n*2;j++)
            {
                if(j<n-i-1)
                {
                    System.out.print(" ");
                }
                else
                {
                    if(j<(n+i))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }// write your code here
    }
}
