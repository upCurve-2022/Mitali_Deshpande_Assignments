package com.company;
import java.util.Scanner;

public class ChkUglyNumber {

    public static void main(String[] args) {
        Scanner MyObj= new Scanner(System.in);
        System.out.println("Enter the number:");
        int no= MyObj.nextInt();
        int flag1=0;
        int flag2=0;
        int flag3=0;
        while(no!=1)
        {
            if(no%2==0)
            {
                no=no/2;
                flag1=1;
            }
            else
            {
                if(no%3==0)
                {
                    no=no/3;
                    flag2=1;
                }
                else
                {
                    if(no%5==0)
                    {
                        no=no/5;
                        flag3=1;
                    }
                    else
                    {
                        flag1=0;
                        flag2=0;
                        flag3=0;
                        break;
                    }
                }
            }

        }
        if(flag1==1&&flag2==1&&flag3==1)
        {
            System.out.println("Number is the Ugly number");
        }
        else
        {
            System.out.println("Number isn't the Ugly number");
        }
    }
}
