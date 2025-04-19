class Person {
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private String jobTitle;
    private String employeeId;

    Employee(String firstName, String lastName, String jobTitle, String employeeId) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
    }

    @Override
    String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }

    String getEmployeeId() {
        return employeeId;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        System.out.println("Person's First Name: " + person.getFirstName());
        System.out.println("Person's Last Name: " + person.getLastName());

        Employee employee = new Employee("Jane", "Smith", "Manager", "EMP123");
        System.out.println("Employee's First Name: " + employee.getFirstName());
        System.out.println("Employee's Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}