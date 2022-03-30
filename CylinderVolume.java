package com.company;
import java.util.Scanner;
public class CylinderVolume {

    public static void main(String[] args) {
        Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter the Height of Cylinder: ");
        double h=MyObj.nextDouble();
        System.out.println("Enter the Radius of Cylinder: ");
        double r=MyObj.nextDouble();

        double Volume= 3.14*(r*r)*h;
        System.out.println("Area of Cylinder is: "+ Volume);
    // write your code here
    }
}
