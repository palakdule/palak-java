
class Person {
    String name;

    void showName() {
        System.out.println("Name: " + name);
    }
}


class Student extends Person {
    int rollNo;

    void display() {
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Palak";  
        s1.rollNo = 101;

        s1.showName();  
        s1.display();   
    }
}