package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorkWithFiles {
    public static void main(String[] args) {
//        File ourFile =new File("our_file.txt");
        try {
//            boolean created = ourFile.createNewFile();
//            if(created){
//                System.out.println("File was created");
//            } else {
//                System.out.println("File was not created");
//            } Это не нужно, так как программа создас файл через writer, если такого еще нет

            FileWriter writer = new FileWriter("our_file_1.txt");
            writer.write("Some stupid text to write in the file!@@@&%**");
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File file = new File("our_file_1.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("File size: " + file.length() + " bytes");

        file.delete();
    }
}
