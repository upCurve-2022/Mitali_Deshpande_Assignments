package com.company;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Binary Number:");
        String n = myObj.nextLine();
        int dno=Integer.parseInt(n,2);
        System.out.println("Corresponding Decimal Number is: \n"+dno);

        // write your code here
    }
}
