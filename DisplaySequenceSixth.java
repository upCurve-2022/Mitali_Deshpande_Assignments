package com.company;

import java.util.Scanner;

public class DisplaySequenceSixth {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = myObj.nextInt();
        int s=4;
        int t=5;
        System.out.print("1 5 ");
        for(int i=2;i<=n;i++)
        {
            if(i%2==0)
            {
                s=s+4;
            }
            else
            {
                s=s+8;
            }
            t=t+s;
            System.out.print(t+" ");
        }// write your code here
    }
}
