package com.company;
import java.util.Scanner;
public class DisplaySequenceFourth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int num[] = new int[100];
        num[1] = 1;
        num[2] = 4;
        num[3] = 7;
        System.out.print(num[1] + " ");
        System.out.print(num[2] + " ");
        System.out.print(num[3] + " ");
        for (int i = 4; i <= n; i++) {
            num[i] = num[i - 1] + num[i - 2] + num[i - 3];
            System.out.print(num[i] + " ");// write your code here
        }
    }
}


