import java.util.Scanner;

public class StairPatternJagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        System.out.println("Enter no. of rows: ");
        n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
