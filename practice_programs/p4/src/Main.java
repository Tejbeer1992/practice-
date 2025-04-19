class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 50000.0; // Example base salary
    }
}

class HRManager extends Employee {
    void work() {
        System.out.println("HR Manager is managing employees");
    }

    void addEmployee() {
        System.out.println("Adding a new employee to the system");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();
        System.out.println("Employee Salary: " + employee.getSalary());

        HRManager hrManager = new HRManager();
        hrManager.work();
        System.out.println("HR Manager Salary: " + hrManager.getSalary());
        hrManager.addEmployee();
    }
}