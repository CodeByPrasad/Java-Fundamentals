package com.Files;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File obj = new File("sample.txt");
        try{
            if (obj.createNewFile()){
                System.out.println("File is created " + obj.getName());
            }
            else {
                System.out.println("File already exists");
            }
        } catch (IOException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
