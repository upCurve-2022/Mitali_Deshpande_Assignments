package com.company;
import java.util.Scanner;

public class LargestAndSecondLargest {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter First Number:");
        Integer n1 = myObj.nextInt();
        System.out.println("Enter Second Number:");
        Integer n2 = myObj.nextInt();
        System.out.println("Enter Third Number:");
        Integer n3 = myObj.nextInt();
        int max1;
        int max2;

        if(n1>n2)
        {
            max1=n1;
            max2=n2;
        }
        else
        {
                max1=n2;
                max2=n1;
        }
        if(n3>max1)
        {
            max2=max1;
            max1=n3;
        }
        else
        {
            if(n3>max2)
            {
                max2=n3;
            }
        }

        System.out.println("Largest Number:"+ max1);
        System.out.println("Second Largest Number:"+max2);
        // write your code here
    }
}
