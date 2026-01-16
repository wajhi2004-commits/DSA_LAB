//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Supra Celica", 510000);
        Car c2 = new Car("Honda", "CG 150", 31000);
        c1.displayDetails();
        c2.displayDetails();

        Student s1 = new Student("John Wick", 101);
        s1.displayInfo();

    }
}
