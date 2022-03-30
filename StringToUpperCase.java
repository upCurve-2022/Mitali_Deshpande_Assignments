package com.company;
import java.util.Scanner;
public class StringToUpperCase {


    public static void main(String[] args) {
        Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter any String:");
        String str=MyObj.nextLine();
        String strup = str.toUpperCase();
        System.out.println(strup);
    }
}
