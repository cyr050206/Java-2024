import java.util.*;

class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter no. of rows");
        int a = sc.nextInt();
        System.out.println("Enter no. of columns");
        int b = sc.nextInt();
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                System.out.print("$");
            }

            System.out.println();
        }
    }
}