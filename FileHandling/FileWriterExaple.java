package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExaple {
    public static void main(String[] args) {
        // DEfine the file name
        String fileName = "example.txt";

        //Create a fileWriter object
        try(FileWriter writer = new FileWriter(fileName)){
            // Write a strinng to the file
            writer.write("Hello, this is a test. ");

            // optionally you flush the writer
            writer.flush();
            System.out.println("Sucessfully written to the file.");
        }catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
