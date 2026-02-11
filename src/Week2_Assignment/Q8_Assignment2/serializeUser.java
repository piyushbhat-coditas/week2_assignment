package Week2_Assignment.Q8_Assignment2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializeUser {
    public static void main(String[] args){
        User user = new User("piyushbhat2512", "piyu2512", "piyushbhat123@gmail.com");
        try {
            //Create file output stream
            FileOutputStream fileOut = new FileOutputStream("user.ser");

            //Create object output stream
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            //Serialize the object
            out.writeObject(user);

            //Close streams
            out.close();
            fileOut.close();

            System.out.println("User object serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

