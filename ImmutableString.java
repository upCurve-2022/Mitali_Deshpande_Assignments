package com.company;
import java.util.Scanner;
public class ImmutableString {


    public static void main(String[] args) {
	Scanner MyObj=new Scanner(System.in);
    System.out.println("Enter any String");
    String str=MyObj.nextLine();
    String s1=str;
    String s2=str;
    System.out.println("Initially:");
    CheckStrReference(s1, s2);
    s1=s1+str;
    System.out.println("After mutation of string s1:");
    CheckStrReference(s1, s2);
    System.out.println("On mutation new string is created and string s1 refers to that string thus string is immutable!");
    // write your code here
    }
    public static void CheckStrReference(String s1, String s2){
        if(s1==s2){
            System.out.println("Both strings are pointing to same address");
        }
        else
        {
            System.out.println("Both strings are pointing to different address");
        }

    }
}
