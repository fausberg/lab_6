package org.example.b;





import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.*;


public class Connector {
    Logger log = LogManager.getLogger(this.getClass());
    public void fileWriter(ElectricAppliance lamp1, ElectricAppliance lamp2) throws FileNotFoundException {
        try {
            FileOutputStream fos = new FileOutputStream("electricAppliance.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(lamp1);
            oos.writeObject(lamp2);

            oos.close();

        } catch (FileNotFoundException e) {
            log.error(e.getMessage());
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }

    public void fileReader() throws FileNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("electricAppliance.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Lamp lamp1 = (Lamp) ois.readObject();
            Lamp lamp2 = (Lamp) ois.readObject();

            System.out.println(lamp1);
            System.out.println(lamp2);

        } catch (FileNotFoundException e) {
            log.error(e.getMessage());
        } catch (IOException e) {
            log.error(e.getMessage());
        } catch (ClassNotFoundException e) {
            log.error(e.getMessage());
        }
    }
}
