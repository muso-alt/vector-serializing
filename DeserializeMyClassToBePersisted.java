
import java.io.*;

import Core.MyClassToBePersisted;

public class DeserializeMyClassToBePersisted {
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("myObject.ser"))) {
            MyClassToBePersisted myObject = (MyClassToBePersisted) inputStream.readObject();
            System.out.println("Object deserialized successfully.");
            System.out.println("Profile: " + myObject.getProfile());
            System.out.println("Group: " + myObject.getGroup());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
