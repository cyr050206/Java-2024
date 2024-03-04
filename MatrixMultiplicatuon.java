import java.util.Scanner;

public class MatrixMultiplicatuon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1, c1, r2, c2;
        int i, j, k;
        System.out.println("Enter row of first matrix: ");
        r1 = sc.nextInt();
        System.out.println("Enter columns of first matrix: ");
        c1 = sc.nextInt();
        System.out.println("Enter row of Second matrix: ");
        r2 = sc.nextInt();
        System.out.println("Enter columns of Second matrix: ");
        c2 = sc.nextInt();
        if (c1 != r2) {
            System.out.println("Enter proper values pls:");
            System.exit(0);
        }
        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        int[][] m3 = new int[r1][c2];
        // int m3
        System.out.println("Enter elements of matrix 1:");
        for (i = 0; i < r1; ++i) {
            for (j = 0; j < c1; ++j) {
                System.out.println("Enter element " + (i + 1) + "," + (j + 1));
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of matrix 2:");
        for (i = 0; i < r1; ++i) {
            for (j = 0; j < c1; ++j) {
                System.out.println("Enter element " + (i + 1) + "," + (j + 1));
                m2[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                m3[i][j] = 0;
            }
        }
        for (i = 0; i < r1; ++i) {
            for (j = 0; j < c2; ++j) {
                for (k = 0; k < c1; ++k) {
                    m3[i][j] += m1[i][k] * m2[k][j];

                }
            }
        }
        System.out.println("The answer is: ");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
