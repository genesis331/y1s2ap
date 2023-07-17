package zixucheah331;
import java.io.PrintWriter;
import java.io.File;

public class WriteFile {
    public static void main(String[] args) throws Exception {
        File filename = new File("scores.txt");
        if (filename.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
        PrintWriter output = new PrintWriter(filename);
        output.print("Hello World from Cheah Zixu for Advanced Programming Test 1");
        output.close();
    }
}