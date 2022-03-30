package com.company;
import java.util.Scanner;
public class AvgArr {

    public static void main(String[] args) {
        double sum=0;
        Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n=MyObj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=MyObj.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        double avg=sum/n;
        System.out.println("Average of the array is:"+ avg);
	// write your code here
    }
}
