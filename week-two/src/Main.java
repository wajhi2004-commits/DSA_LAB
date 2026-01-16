//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {          // O(n)
            for (int j = 1; j <= n; j++) {      // O(n)
                System.out.println(i + ", " + j);
            }
        }
        MyArray numbers = new MyArray(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40); // full
        numbers.print();

        DynamicArray Numbers = new DynamicArray(2);
        Numbers.insert(10);
        Numbers.insert(20);
        Numbers.insert(30); // triggers resize
        Numbers.insert(40);
        Numbers.print();

        Numbers.removeAt(2);
        Numbers.print();

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}
