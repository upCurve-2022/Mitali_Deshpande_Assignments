package com.company;

import java.util.Scanner;

public class DisplaySequenceSecond {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = myObj.nextInt();
        int sumEven=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.print( i + " ");
            }
            else
            {
                System.out.print( i*-1 + " ");
            }
        }// write your code here
    }
}
