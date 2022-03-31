package com.company;
import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n=MyObj.nextInt();
        int r,sum=0,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(temp==sum)
            System.out.println("This is an Armstrong  number ");
        else
            System.out.println("This is not an Armstrong number");
        // write your code here
    }
}
