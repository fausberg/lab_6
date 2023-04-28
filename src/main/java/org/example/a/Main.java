package org.example.a;

import javafx.scene.shape.Path;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    static String fileName = "C:\\Program From Git\\lab_6\\file.txt";

    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("fileb.txt");
            FileInputStream fileStream = new FileInputStream(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileStream));
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.matches("^(?ui:[аеёиоуыэюя]).*")) {
                    fileWriter.write(line);
                    fileWriter.append("\n");
                    fileWriter.flush();
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