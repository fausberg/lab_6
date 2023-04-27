package org.example.c;

import java.io.*;
import java.util.ArrayList;

public class Main {

    static String fileName = "file1.txt";

    public static void main(String[] args) throws IOException {
        try {
            ArrayList<String> list = new ArrayList<>();
            FileInputStream fileStream = new FileInputStream(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileStream));
            String line = null;
            while ((line = reader.readLine()) != null) {
                StringBuffer stringBuffer = new StringBuffer(line);
                stringBuffer.reverse();
                line = new String(stringBuffer);
                list.add(line);
            }
            reader.close();
            Connector connector = new Connector();
            connector.fileWriter(list);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new IOException(e);
        }
    }
}
