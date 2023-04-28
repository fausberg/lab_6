package org.example.c;

import org.example.b.ElectricApplianceList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Connector {

    public void fileWriter(ArrayList<String> list) {
        try {
            File f = new File("C:\\Program From Git\\lab_6\\directory\\file2.txt");
            File direcrory = new File("C:\\Program From Git\\lab_6\\directory");
            direcrory.mkdir();
            f.createNewFile();
            FileWriter fileWriter = new FileWriter(f);
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
