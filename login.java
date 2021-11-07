

/**
 * login
 */

import java.io.*;
public class login {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String Username, password;

    public static boolean loginMe() {
        com.print_input("Enter The Username : ");
        login.Username = com.getInput();
        com.print_input("Enter The Password : ");
        login.password = com.getInput();

        String MyUsername = "Admin";
        String MyPassword = "123";

        if (MyUsername.equals(Username) && MyPassword.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}