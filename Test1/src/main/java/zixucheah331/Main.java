package zixucheah331;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try {
            myMethod();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught");
        }
    }

    public static void myMethod() throws ArrayIndexOutOfBoundsException, FileNotFoundException {
        int[] myArray = new int[10];
        try {
            System.out.println(myArray[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }

        File filename = new File("scores.txt");
        try {
            PrintStream output = new PrintStream(filename);
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

}
