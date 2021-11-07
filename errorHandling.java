

import java.io.*;

/**
 * errorHandling
 */
public class errorHandling {

    public errorHandling (NullPointerException ex){
        System.out.println(ex.getMessage());
    }

    public errorHandling (NumberFormatException ex){
        System.out.println(ex.getMessage());
    }

    public errorHandling (StringIndexOutOfBoundsException ex){
        System.out.println(ex.getMessage());
    }

    public errorHandling (ArithmeticException ex){
        System.out.println(ex.getMessage());
    }

    public errorHandling (FileNotFoundException ex){
        System.out.println(ex.getMessage());
    }

    public errorHandling (ArrayIndexOutOfBoundsException ex){
        System.out.println(ex.getMessage());
    }

}
