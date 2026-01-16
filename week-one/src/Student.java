public class Student {
    String name;
    int rollNo;

    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

