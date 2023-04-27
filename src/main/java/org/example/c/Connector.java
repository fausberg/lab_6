package org.example.c;

import org.example.b.ElectricApplianceList;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Connector {

    public void fileWriter(ArrayList<String> list) {
        try(FileWriter fileWriter = new FileWriter("file2.txt", false)) {
            for (String st : list) {
                fileWriter.write(st);
                fileWriter.append('\n');
            }
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
