package dictionary;

public class Main {

    public static void main(String[] args) {
        // Test your dictionary here

        MultipleEntryDictionary dict = new PersonalMultipleEntryDictionary();

        dict.add("Chips", "crisps");
        dict.add("Fries", "chips");
        dict.add("Chips", "potetgull");
        dict.add("Fries", "pommes");

        System.out.println(dict.translate("Chips"));

        System.out.println(dict.translate("Fries"));

        dict.remove("Chips");
        System.out.println(dict.translate("Chips"));

    }
}
