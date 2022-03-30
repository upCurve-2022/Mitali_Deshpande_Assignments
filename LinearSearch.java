package com.company;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int n = myObj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements in Array:");
        for(int i=0;i<n;i++){
            arr[i] = myObj.nextInt();
        }
        System.out.println("Enter Number To Be Searched In Array:");
        int s = myObj.nextInt();
        int t=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==s)
            {
                t=i;
                break;
            }
        }
        if(t<0)
        {
            System.out.println("Number not found in array!");
        }
        else
        {
            t++;
            System.out.println("Number found at location:"+t);
        }
	// write your code here
    }
}
