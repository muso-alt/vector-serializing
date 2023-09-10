import java.io.*;

import Core.MyClassToBePersisted;

public class SerializeMyClassToBePersisted {
    public static void main(String[] args) {
        MyClassToBePersisted myObject = new MyClassToBePersisted("John Doe", "Group A");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("myObject.ser"))) {
            outputStream.writeObject(myObject);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}