class Student {
    String name;
    int rollNo;
    double marks;

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        // Assign values
        s1.name = "Palak";
        s1.rollNo = 101;
        s1.marks = 85.5;

        // Display details
        s1.display();
    }
}