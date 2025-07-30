import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> People = new ArrayList<>();

        ArrayList<String> pets1 = new ArrayList<>();
        pets1.add("Dog");
        pets1.add("Cat");

        ArrayList<String> pets2 = new ArrayList<>();
        pets2.add("Parrot");

        ArrayList<String> pets3 = new ArrayList<>();

        ArrayList<String> pets4 = new ArrayList<>();
        pets4.add("Fish");
        pets4.add("Hamster");

        ArrayList<String> pets5 = new ArrayList<>();
        pets5.add("Turtle");
        pets5.add("Rabbit");

        People.add(new Person("John", 25, "01/01/2000", "123-45-6789", pets1));
        People.add(new Person("Jane", 30, "02/02/1995", "234-56-7890", pets2));
        People.add(new Person("Alice", 28, "03/03/1997", "345-67-8901", pets3));
        People.add(new Person("Bob", 35, "04/04/1989", "456-78-9012", pets4));
        People.add(new Person("Charlie", 22, "05/05/2003", "567-89-0123", pets5));

        for (Person person : People) {
            person.Greet();
        }
    }
}

