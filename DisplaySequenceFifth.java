package com.company;

import java.util.Scanner;

public class DisplaySequenceFifth {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = myObj.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(i*i+" ");
        }// write your code here
    }
}
