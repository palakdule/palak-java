class Employee {
    
    int empId;
    String name;
    double salary;

    void setDetails(int id, String n, double s) {
        empId = id;
        name = n;
        salary = s;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        
        emp1.setDetails(101, "Rahul", 50000);

        
        emp1.displayDetails();
    }
}