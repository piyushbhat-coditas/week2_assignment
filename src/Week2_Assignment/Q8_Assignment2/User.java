package Week2_Assignment.Q8_Assignment2;
import java.io.Serializable;

public class User implements Serializable {
    private final long serialVersionUID = 1L;

    private String username;
    private transient String password;
    private String email;

    //Constructor
    public User(String username, String password, String email) {
        this.username = "piyushbhat2512";
        this.password = "piyu2512";
        this.email = "piyushbhat123@gmail.com";
    }

    //Getter methods for printing values
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}