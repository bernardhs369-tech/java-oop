public class Person {
    private static final int ADULT_AGE = 18;

    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public void checkAge() {
        if (age >= ADULT_AGE) {
            System.out.println(name + " is an adult.");
        } else {
            System.out.println(name + " is a minor.");
        }
    }
}
