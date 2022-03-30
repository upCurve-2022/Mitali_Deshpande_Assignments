package com.company;
import java.util.Scanner;
import java.io.FileOutputStream;

public class WriteFileOutputStream {

    public static void main(String[] args) {
        Scanner MyObj=new Scanner(System.in);
        try{
            FileOutputStream fos=new FileOutputStream("Demo", true);
            System.out.println("Enter the content: ");
            String str=MyObj.nextLine()+'\n';
            byte[] b=str.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("file saved");

        }
        catch(Exception e){
            e.printStackTrace();
        }

        // write your code here
    }
}
