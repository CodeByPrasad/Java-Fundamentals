package com.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        File obj = new File("sample.txt");
         try{
                FileWriter writer = new FileWriter("sample.txt");
                writer.write("This is sample file");
                writer.close();
                System.out.println("Data inserted");
            }catch (IOException e){
                System.out.println("error occured when writing");
                e.printStackTrace();
            }
        }
}
