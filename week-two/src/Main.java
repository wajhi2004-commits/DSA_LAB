import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int sum = 0, max = arr[0], index = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        double avg = (double) sum / n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Max = " + max + " at index " + index);
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(n)");
    }
}
