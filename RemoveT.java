package com.company;
import java.util.Scanner;
public class RemoveT {


    public static void main(String[] args) {
        Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter any String:");
        String str=MyObj.nextLine();
        String strTemp="";
        int i=0;
        while(i<str.length())
        {
            if(str.charAt(i)!='t'&&str.charAt(i)!='T'){
                strTemp=strTemp + str.charAt(i);
            }
            i++;
        }
        str=strTemp;
        System.out.println("After removing all T and t:"+str);
	// write your code here
    }
}
