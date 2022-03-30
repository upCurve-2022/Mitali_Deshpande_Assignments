package com.company;
import java.util.Scanner;
public class DuplicateCharacters {


    public static void main(String[] args) {
        Scanner MyObj=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=MyObj.nextLine();
        int count;
        char[] String=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            count=1;
            for(int j=i+1;j<str.length();j++)
            {
                if(String[i]==String[j]&&String[i]!=' ')
                {
                    count++;
                    String[j]='0';
                }
            }
            if(count>1&&String[i]!='0')
            {
                System.out.println("Duplicated character:"+String[i]);
                System.out.println("No. of times duplicated:"+count);
            }
        }
    }
}
