package com.Files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File obj = new File("Sample.txt");
        if (obj.delete()) {
            System.out.println("File is deleted successfully " + obj.getName());
        }
        else {
            System.out.println("Failed to delete file");
        }
    }
}
