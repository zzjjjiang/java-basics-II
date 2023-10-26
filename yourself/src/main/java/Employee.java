public class Employee extends Person{
    public Employee(){
        super();
    }

    public static void main(String[] args) {
        Employee a = new Employee();
        System.out.println(a.speak());
    }
}
