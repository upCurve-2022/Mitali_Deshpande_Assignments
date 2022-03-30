package com.company;
import java.util.Scanner;
public class DisAndSPPen {

    public static void main(String[] args) {
	    Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter the Cost price of pen:");
        double cp=MyObj.nextDouble();
        System.out.println("Enter the Discount percentage:");
        double discount=MyObj.nextDouble();

        double discountPrice=(discount/100)*cp;
        double sp=cp-discountPrice;

        System.out.println("Discounted Amt.:"+ discountPrice);
        System.out.println("Selling Price:"+ sp);
        // write your code here
    }
}
