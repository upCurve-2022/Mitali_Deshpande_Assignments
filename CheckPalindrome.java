package com.company;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter A Word:");
        String X = myObj.nextLine();
        int n= X.length();
        int flag=0;
        for(int i=0;i<n;i++){
            if(X.charAt(i)!=X.charAt(n-i-1))
            {
                flag=1;
            }

        }
        if(flag==1)
        {
            System.out.println("Not a Palindrome");
        }
        else
        {
            System.out.println("Palindrome");
        }

    }
}