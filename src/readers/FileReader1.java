package readers;

import java.io.*;

public class FileReader1 {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader fis = new InputStreamReader(System.in)) {
            System.out.println("please enter q to quit");
            char c;

            do {
                c = (char) fis.read();
                System.out.println(c);
            }
            while (c != 'q');

        }
    }
}