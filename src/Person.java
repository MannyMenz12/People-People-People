import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private String dob;
    private String ssn;
    private ArrayList<String> pets;

    public Person(String name, int age, String dob, String ssn, ArrayList<String> pets) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.ssn = ssn;
        this.pets = pets;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getSsn() { return ssn; }
    public void setSsn(String ssn) { this.ssn = ssn; }

    public ArrayList<String> getPets() { return pets; }
    public void setPets(ArrayList<String> pets) { this.pets = pets; }

    public void Greet() {
        if (pets.isEmpty()) {
            System.out.println("Hello! My name is " + name + ", I am " + age + " years old, and I do not have any pets.");
        } else {
            System.out.println("Hello! My name is " + name + ", I am " + age + " years old, and my pets are " + String.join(", ", pets) + ".");
        }
    }
}
