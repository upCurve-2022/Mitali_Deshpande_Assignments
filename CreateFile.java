package com.company;
import java.io.IOException;
import java.nio.file.*;

public class CreateFile {

    public static void main(String[] args) {
	    Path path=Paths.get("D:\\Demo.txt");
        try
        {
            Path p = Files.createFile(path);
            System.out.println("File Created at path: "+p);// write your code here
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
