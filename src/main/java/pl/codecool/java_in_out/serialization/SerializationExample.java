package pl.codecool.java_in_out.serialization;

import java.io.*;

public class SerializationExample {

    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/serialization/object_file.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);


        User user = new User("John", "XYZ", 30);
        objectOutputStream.writeObject(user);

        objectOutputStream.writeBoolean(true);


    }
}
