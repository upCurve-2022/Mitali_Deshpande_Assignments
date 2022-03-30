package com.company;

import java.util.Scanner;

public class DisplaySequenceThird {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = myObj.nextInt();
        int mul=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                mul=mul*i;
            }
            System.out.print(mul+" ");
            mul=1;
        }// write your code here
    }
}
