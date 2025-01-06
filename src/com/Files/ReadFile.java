package com.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File obj = new File("sample.txt");
        try {
            Scanner scan = new Scanner(obj);
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                System.out.println("File data is: " + "\n" + data);
            }
            scan.close();
        } catch (FileNotFoundException e){
            System.out.println("Error occured when reading data");
            e.printStackTrace();
        }
    }
}
