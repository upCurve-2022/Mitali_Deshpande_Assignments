package com.company;
import java.util.*;

public class PatternPrintingFirst {

    public static void main(String[] args) {
	Scanner myObj= new Scanner(System.in);
    System.out.println("Enter a number");
    Integer n = myObj.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print("* ");// write your code here
        }
        System.out.println();
    }
    }
}
