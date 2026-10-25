public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Maria", 15);
        Person person2 = new Person("Camila", 20);

        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        person1.checkAge();

        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
        person2.checkAge();
    }
}
