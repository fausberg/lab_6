package org.example.a;

import java.io.*;

public class Main {

    static String fileName = "file.txt";

    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fileStream = new FileInputStream(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileStream));
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.matches("^(?ui:[аеёиоуыэюя]).*")) {
                    System.out.println(line);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new IOException(e);
        }
    }
}