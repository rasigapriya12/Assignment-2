import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("nonexistent.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Input/Output error occurred!");
        }
    }
}
