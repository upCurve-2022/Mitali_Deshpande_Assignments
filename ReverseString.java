package com.company;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter A Word:");
        String X = myObj.nextLine();
        String nX= "";
        for(int i=0;i<X.length();i++){
            nX=X.charAt(i)+nX;
            //X=X.substring(i);// write your code here
        }
        System.out.println("Reversed Word:"+nX);
    }
}
