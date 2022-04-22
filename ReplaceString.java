package com.company;
import java.util.Scanner;
public class ReplaceString {

    public static void main(String[] args) {
        System.out.println("Enter the String:");
	Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println("Currently string is:"+str);
    System.out.println("String after replacing a to $:"+str.replace('a','$'));// write your code here
    }
}
