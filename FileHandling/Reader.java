package FileHandling;

import java.io.*;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        String fileName = "java-course.txt";

        try(FileReader reader = new FileReader(fileName)){
            
            int read = 0;
            do{
                // (char) is used to show that it is a charter and reader read as interger so we use (char).
                read = reader.read();
                System.out.print((char)read);
            }while(read != -1);
        }catch(IOException e){
            System.out.printf("Exception occured: %s",e.getMessage());
        }
    }
}
