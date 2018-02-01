
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

//        list.add(new Student("Alan Turing", "017635727"));
//        list.add(new Student("Linus Torvalds", "011288989"));
//        list.add(new Student("Steve Jobs", "013672548"));
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();

            if (name.isEmpty()) {

                break;
            }

            System.out.print("studentnumber: ");
            String number = reader.nextLine();

            list.add(new Student(name, number));

            System.out.println("");

        }

        for (Student student : list) {

            System.out.println(student);
        }

        System.out.println("");

        while (true) {
            System.out.print("Give search term: ");
            String keywords = reader.nextLine();

            if (keywords.isEmpty()) {
                break;
            }

            System.out.println("");

            System.out.println("Result:");
            for (Student student : list) {
                if (student.getName().contains(keywords)) {
                    System.out.println(student);
                }
            }

            System.out.println("");

        }

    }
}
