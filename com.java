

/**
 * com
 */
import java.io.*;

public class com {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void print(Object message) {
        System.out.println(message);
    }

    public static void print_input(Object message) {
        System.out.print(message);
    }

    public static String getInput() {
        String myRet = "";
        try {
            myRet = bf.readLine();
        } catch (IOException ex) {
            com.print(ex.getMessage());
        }

        return myRet;

    }

    public static String getInputData(String Message) {
        String myRet = null;
        try {

            System.out.print(Message);
            myRet = bf.readLine();

        } catch (IOException ex) {
            com.print(ex.getMessage());
        }

        return myRet;
    }
    public static int StrToInt(String _data) {
        return Integer.valueOf(_data);
    }
    
    public static int intConvert(String str) {

        int myRet = 0;
        try {
            myRet = Integer.valueOf(str);
        } catch (NumberFormatException ex) {
            com.print(ex.getMessage());
        }

        return myRet;
    }
}