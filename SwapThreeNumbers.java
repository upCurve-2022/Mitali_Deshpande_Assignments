package com.company;
import java.util.Scanner;

public class SwapThreeNumbers {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter first Number:");
        Integer n1 = myObj.nextInt();
        System.out.println("Enter second Number:");
        Integer n2 = myObj.nextInt();
        System.out.println("Enter third Number:");
        Integer n3 = myObj.nextInt();
        int temp;

        temp=n1;
        n1=n2;
        n2=n3;
        n3=temp;

        System.out.println("first number now:"+n1);
        System.out.println("second number now:"+n2);
        System.out.println("third number now:"+n3);// write your code here
    }
}
