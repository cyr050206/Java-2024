import java.util.Scanner;

public class Arrayadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr1[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr1[i] = sum - arr[i];
        }
        System.out.println("sum is");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        sc.close();
    }
}
