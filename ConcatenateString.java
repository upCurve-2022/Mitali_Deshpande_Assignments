package com.company;
import java.util.Scanner;
public class ConcatenateString {


    public static void main(String[] args) {
        Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter any String:");
        String str1=MyObj.nextLine();
        System.out.println("Enter another String:");
        String str2=MyObj.nextLine();
        str1=str1+str2;
        System.out.println("Concatenated String is: "+ str1);
    }
}
