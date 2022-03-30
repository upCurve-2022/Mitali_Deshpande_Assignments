package com.company;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = myObj.nextInt();
        int[] arr=new int[n];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        // write your code here
    }
}
