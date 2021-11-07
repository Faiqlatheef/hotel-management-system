
import java.io.*;

/**
 * br
 */
public class br {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void print(Object message) {
        System.out.println(message);
    }

    public static int intConvert(String str) {

        int myRet = 0;
        try {
            myRet = Integer.valueOf(str);
        } catch (NumberFormatException ex) {
            br.print(ex.getMessage());
        }

        return myRet;
    }

    public static String getInputData(String Message) {
        String myRet = null;
        try {

            System.out.print(Message);
            myRet = bf.readLine();

        } catch (IOException ex) {
            br.print(ex.getMessage());
        }

        return myRet;
    }
}