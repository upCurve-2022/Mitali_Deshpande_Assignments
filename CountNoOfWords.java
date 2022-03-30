package com.company;
import java.util.Scanner;
public class CountNoOfWords {


    public static void main(String[] args) {
        Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter any String:");
        String str1=MyObj.nextLine();
        char ch[]= new char[str1.length()];
        int count=0;
        for(int i=0;i<str1.length();i++)
        {
            ch[i]= str1.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }
        System.out.println("No. Of Words = "+count);// write your code here
    }
}
