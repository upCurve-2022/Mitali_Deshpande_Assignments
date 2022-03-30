package com.company;

import java.util.Scanner;

public class PrimeBtwNAndM {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter starting Number:");
        int n1 = myObj.nextInt();
        System.out.println("Enter ending Number:");
        int n2 = myObj.nextInt();
        int flag=0;
        int count=0;
        for(int i=n1;i<=n2;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                System.out.print(i+" ");
            }
            flag=0;

        }

    }
}
