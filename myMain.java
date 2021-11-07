

/**
 * myMain
 */
public class myMain {

    public static void main(String[] args) {
        if (login.loginMe()) {
            dashBoard d = new dashBoard();
        } else {
            com.print("Eorror Login ");
        }

        
    }
}