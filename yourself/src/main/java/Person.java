public class Person {
    private int ssn;
    private byte age;
    private String firstName;
    private String lastName;
    private float salary;

    public Person() {
        this.firstName = "no first name";
        this.lastName = "no last name";
    }

    Person(String firstName, String lastName, Byte age, Integer ssn, float salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public byte getAge() {
        return age;
    }

    public String speak() {
        return firstName + " " + lastName + " and salary is " + salary;
    }
}