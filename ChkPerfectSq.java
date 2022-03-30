package com.company;
import java.util.Scanner;

public class ChkPerfectSq {

    public static void main(String[] args) {
        Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num= MyObj.nextInt();
        int i=2;
        int ans=0;
        while(i*i<=num)
        {
            if(i*i==num)
            {
                ans=i;
                break;// write your code here
            }
            i++;
        }
        if(ans!=0)
        {
            System.out.println("Number is perfect square!");

        }
        else
        {
            System.out.println("Number is not a perfect square!");
        }
    }
}
