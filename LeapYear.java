package com.company;
import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {
	    Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter the Year:");
        int year=MyObj.nextInt();
        if(year%100!=0)
        {
            if(year%4==0)
            {
                System.out.println("This is the leap year!");// write your code here
            }
            else
            {
                System.out.println("This isn't the leap year!");
            }
        }
        else
        {
            if(year%400==0)
            {
                System.out.println("This is the leap year!");
            }
            else
            {
                System.out.println("This isn't the leap year!");
            }
        }
    }
}
