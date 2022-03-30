package com.company;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Integer Number:");
        int n = myObj.nextInt();
        System.out.println("Corresponding Binary Number: \n"+Integer.toBinaryString(n));
        // write your code here
    }
}
