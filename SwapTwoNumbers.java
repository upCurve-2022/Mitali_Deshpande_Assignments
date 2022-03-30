package com.company;
import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter first Number:");
        Integer n1 = myObj.nextInt();
        System.out.println("Enter second:");
        Integer n2 = myObj.nextInt();

        int temp;

        temp=n1;
        n1=n2;
        n2=temp;

        System.out.println("first number now:"+n1);
        System.out.println("second number now:"+n2);// write your code here
    }
}
