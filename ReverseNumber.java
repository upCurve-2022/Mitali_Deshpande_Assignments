package com.company;
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Number:");
        Long n = myObj.nextLong();
        Long t= 0L;
        while(n>0)
        {
            t=t*10+(n%10);
            n=n/10;
        }
        System.out.println("Reversed Number:" + t);
    }
}
