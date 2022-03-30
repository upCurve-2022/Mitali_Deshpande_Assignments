package com.company;
import java.util.Scanner;
public class SwiggyDelivery {
    static void CheckPin(String s) throws MyException {

        if(s.length()!=6)
        {
            throw new MyException("Invalid Pin Code");
        }
        else
        {
            System.out.println("Pin Code Accepted!");
        }

    }

    public static void main(String[] args) {
        AcceptPin();// write your code here
    }
    public static void AcceptPin(){
        Scanner MyObj=new Scanner(System.in);
        System.out.println("Please Enter The Pin Code For Delivery:");
        String s= MyObj.nextLine();
        try
        {
            // calling the method
            CheckPin(s);
            System.out.println("Your Order Wil Be Delivered Soon:)...");
        }
        catch (MyException ex)
        {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }


    }

}
