package com.company;

public class ChkStrEmpty {

    public static void main(String[] args) {
	String s="";
    String t="Target";
        isEmpty(s);
        isEmpty(t);
    // write your code here
    }
    public static void isEmpty(String s){
        if(s=="")
        {
            System.out.println("String is Empty");
        }
        else
        {
            System.out.println("String isn't Empty");
        }
    }
}
