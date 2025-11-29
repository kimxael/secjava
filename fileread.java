import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileread {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            System.out.println("First line: " + line);

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: sample.txt not found!");
        } catch (IOException e) {
            System.out.println("Error: Could not read the file.");
        }
    }
}
