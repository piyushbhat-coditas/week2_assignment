package Week2_Assignment.Q8_Assignment2;

import java.io.*;

public class deserializeUser {
    public static void main(String[] args) throws FileNotFoundException {
        User user = null;

        try {
            //reate file input stream
            FileInputStream fileIn = new FileInputStream("user.ser");

            //reate object input stream
            ObjectInputStream in = new ObjectInputStream(fileIn);

            //Deserialize the object
            user = (User) in.readObject(); //explicit typecasting

            //Close streams
            in.close();
            fileIn.close();

            //Print object fields
            System.out.println("Deserialized User: " + user);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


//        FileOutputStream fileOut = new FileOutputStream("user.ser");
//        System.out.println("Serialized file path: " + new java.io.File("user.ser").getAbsolutePath());

    }
}
