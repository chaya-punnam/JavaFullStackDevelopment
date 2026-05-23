package Day6_ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

    public static void main(String[] args) {

        try {

            FileReader fr =
                    new FileReader("sample.txt");

            int i;

            while((i = fr.read()) != -1) {

                System.out.print((char)i);

            }

            fr.close();

        }
        catch(IOException e) {

            System.out.println(e);

        }

    }
}