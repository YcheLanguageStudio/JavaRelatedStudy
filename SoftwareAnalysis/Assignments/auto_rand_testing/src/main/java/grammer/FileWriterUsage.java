package grammer;

import java.io.*;

/**
 * Created by cheyulin on 10/16/16.
 */
public class FileWriterUsage {
    public static void main(String[] args) throws IOException {
        System.out.println("Write File to Current Dir:" + new File("").getAbsolutePath());
        File file = new File("file_study.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(Integer.toString(123456789));
        writer.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        System.out.println("read from file:" + bufferedReader.readLine());
        bufferedReader.close();
    }
}
