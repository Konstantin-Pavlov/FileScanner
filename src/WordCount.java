import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) throws Exception {

        try {
            File file = new File("Tales from Dickens by Charles Dickens and Hallie Erminie Rives.txt");
            Scanner scanner = new Scanner(file);
            int i = 0, words = 0;
            while (scanner.hasNextLine()) { //return true or false
                String line = scanner.nextLine(); //return every string
                //System.out.println("line " + (++i) + " has " + (line.split(" ").length) + " words");
                words += line.split(" ").length;
            }
            System.out.println("the file contains " + words + " words");
        }
        catch(FileNotFoundException exception) {
            // Handle the situation by letting the user know what happened
            System.out.println("Cannot find this file!");
        }

    }

}
