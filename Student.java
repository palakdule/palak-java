class Student {
    private int rollNo;
    private String name;

    public void setRollNo(int r) {
        rollNo = r;
    }

    public void setName(String n) {
        name = n;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setRollNo(101);
        s1.setName("Kunal");

        System.out.println("Roll Number: " + s1.getRollNo());
        System.out.println("Name: " + s1.getName());
    }
}