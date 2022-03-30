package com.company;

import java.util.Scanner;
import java.util.*;

public class BinarySearch {

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
        int start=0;
        int end=n;
        int mid=0;
        Arrays.sort(arr);
        while(start<=end)
        {
            mid=(start+end)/2;
            if(arr[mid]==s)
            {
                t=mid;
                break;
            }
            else
            {
                if(arr[mid]>s)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        if(t<0)
        {
            System.out.println("Number not found in array!");
        }
        else
        {
            t++;
            System.out.println("Number found!");
        }
        // write your code here
    }
}
