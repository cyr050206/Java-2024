
//Find the repeated element in the array
import java.util.*;

public class repeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n = 0;
        int count = 0, count1 = 0;
        int a[] = new int[10];
        System.out.println("Enter the elements in the array: ");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (j == i) {
                    continue;
                }
                if (a[i] == a[j]) {

                    System.out.println("Repeated Word is " + count);
                    a = delArray(a);
                    break;

                }
            }

        }

    }

    static int[] delArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < arr.length - j - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                }
            }

        }
        return arr;
    }

}