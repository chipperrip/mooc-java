package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if (name == null
                || name.length() > 40
                || name.isEmpty()
                || age < 0 
                || age > 120) {
            throw new IllegalArgumentException(
                    "Name variable must not be null, "
                    + "empty, or longer than 40 characters. "
                    + "The age has also to be between 0-120. ");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
