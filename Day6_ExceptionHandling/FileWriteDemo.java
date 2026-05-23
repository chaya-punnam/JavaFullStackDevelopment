package Day6_ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

    public static void main(String[] args) {

        try {

            FileWriter fw =
                    new FileWriter("sample.txt");

            fw.write(
                    "Welcome To Java Full Stack");

            fw.close();

            System.out.println(
                    "File Written Successfully");

        }
        catch(IOException e) {

            System.out.println(e);

        }

    }
}