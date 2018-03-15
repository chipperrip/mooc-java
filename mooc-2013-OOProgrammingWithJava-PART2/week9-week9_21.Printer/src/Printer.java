
import java.io.File;
import java.util.Scanner;

public class Printer {

    private File file;

    public Printer(String fileName) throws Exception {
        file = new File(fileName);
    }

    public void printLinesWhichContain(String word) {

        Scanner reader;

        try {
            reader = new Scanner(file);
        } catch (Exception e) {
            System.out.println("There is no file.");
            return;
        }

        //if argument string is empty, print whole file
        if (word.isEmpty()) {
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            return;

        } else {
            //if word is not empty, print lines that contain word
            while (reader.hasNextLine()) {
                String workingLine = reader.nextLine();

                if (workingLine.contains(word)) {
                    System.out.println(workingLine);
                }
            }
        }
    }
}