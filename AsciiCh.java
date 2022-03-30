package com.company;
import java.util.Scanner;
public class AsciiCh {

    public static void main(String[] args) {
	    Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=MyObj.next().charAt(0);
        int asciiCh=(int) ch;
        System.out.println("It's ASCII value is: "+ asciiCh);// write your code here
    }
}
