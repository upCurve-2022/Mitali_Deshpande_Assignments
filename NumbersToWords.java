package com.company;
import java.util.Scanner;

public class NumbersToWords {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter the number");
        String n = myObj.nextLine();
        for(int i=0; i<n.length();i++)
        {
            if(n.charAt(i)=='1')
            {
                System.out.print("One ");
            }
            else
            {
                if(n.charAt(i)=='2')
                {
                    System.out.print("Two ");
                }
                else
                {
                    if(n.charAt(i)=='3')
                    {
                        System.out.print("Three ");
                    }
                    else
                    {
                        if(n.charAt(i)=='4')
                        {
                            System.out.print("Four ");
                        }
                        else
                        {
                            if(n.charAt(i)=='5')
                            {
                                System.out.print("Five ");
                            }
                            else
                            {
                                if(n.charAt(i)=='6')
                                {
                                    System.out.print("Six ");
                                }
                                else
                                {
                                    if(n.charAt(i)=='7')
                                    {
                                        System.out.print("Seven ");
                                    }
                                    else
                                    {
                                        if(n.charAt(i)=='8')
                                        {
                                            System.out.print("Eight ");
                                        }
                                        else
                                        {
                                            if(n.charAt(i)=='9')
                                            {
                                                System.out.print("Nine ");
                                            }
                                            else
                                            {
                                                System.out.print("Zero ");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}