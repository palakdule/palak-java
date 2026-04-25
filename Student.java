class Student {
    String name;
    int rollNo;

    // Constructor
    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        // Constructor is called here
        Student s1 = new Student("Palak", 101);
        Student s2 = new Student("Kunal", 102);

        s1.display();
        s2.display();
    }
}