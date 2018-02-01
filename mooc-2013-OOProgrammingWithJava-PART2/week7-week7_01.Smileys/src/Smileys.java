
public class Smileys {

    public static void main(String[] args) {
        //   Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {

        //if the string is of odd length, add a whitespace " "
        if (characterString.length() % 2 == 1) {
            characterString += " ";
        }

        // prefix and suffix string with whitespaces 
        characterString = " " + characterString + " ";

        //surround string with a box of smileys
        System.out.println(smileyRow(characterString.length()));
        System.out.println(smiley() + characterString + smiley());
        System.out.println(smileyRow(characterString.length()));

    }

    private static String smileyRow(int length) {

        //prints a row of smileys relative to the length of the supplied string
        String smileyRow = "";

        for (int i = 0; i < (length / 2) + 2; i++) {
            smileyRow += smiley();
        }
        return smileyRow;
    }

    private static String smiley() {

        //supplies smileys wherever they might be needed
        return ":)";
    }
}
