import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter the 10 numbers");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Displaying all elements' squares be like:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] * a[i] + " ");
        }
        sc.close();
    }
}
