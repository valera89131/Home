package lessons6.homeWork;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File book1 = new File("book.txt");

        readAndWriteFile(book1);
    }

    public static void readAndWriteFile(File file) {
        int line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("copyBook.txt"));) {
            while ((line = bufferedReader.read()) != -1) {
                int k =0;
                    bufferedWriter.write((char)line);
                    k++;
                if (k==100) {
                    bufferedWriter.write("\n");
                    k=0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
