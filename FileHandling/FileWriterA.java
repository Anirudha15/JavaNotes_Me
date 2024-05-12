package FileHandling;

import java.io.*;

public class FileWriterA {
    

    public static void main(String[] args) {
        String fileName = "java-course.txt";

        // Try with resource automatically close object
        try( FileWriter writer = new FileWriter(fileName)){
            // by using this object we have to close this manually.
        //   FileWriter wirter = new FileWriter(fileName);
          writer.write("This is the best java course...");
          for(int i = 0; i< 10;i++){
            writer.write('*');
          }
          writer.flush();
          System.out.println("File written sucessfully...");
        //   wirter.close();
        }
        catch(IOException exception){
            System.out.printf("Exception occured %s\n", exception.getMessage());
        }     
    }

}
