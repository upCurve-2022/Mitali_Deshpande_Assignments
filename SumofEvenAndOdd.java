package com.company;
import java.util.Scanner;

public class SumofEvenAndOdd {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = myObj.nextInt();
        System.out.println("Enter the coice as:\n1- To find sum of odd numbers from 1-number\n2-To find sum of even from 0-number");
        int choice = myObj.nextInt();

        switch(choice)
        {
            case 1:
                int sumOdd=0;
                for(int i=0;i<=n;i++)
                {
                    if(i%2!=0)
                    {
                        sumOdd=sumOdd+i;
                    }
                }
                System.out.println("Sum of Odd Number is:"+ sumOdd);
                break;
            case 2:
                int sumEven=0;
                for(int i=0;i<=n;i++)
                {
                    if(i%2==0)
                    {
                        sumEven=sumEven+i;
                    }
                }
                System.out.println("Sum of Even Number is:"+ sumEven);
                break;
            default:
                break;
        }
    }
}
