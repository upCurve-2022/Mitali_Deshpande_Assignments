package com.company;
import java.util.Scanner;
public class ChkStringContain {


    public static void main(String[] args) {
        Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter first String:");
        String str1=MyObj.nextLine();
        System.out.println("Enter second string");
        String str2=MyObj.nextLine();
        int n1=str1.length();
        int n2=str2.length();
        int flag=0;
        for(int i=0;i<n1-n2+1;i++)
        {
            int j=i+n2;
            if(str2.compareTo(str1.substring(i,j))==0)
            {
                flag=1;
            }

        }
        if(flag==1)
        {
            System.out.println("String 1 contains String 2");
        }
        else
        {
            System.out.println("String 1 do not contain string 2");
        }

    }
}
