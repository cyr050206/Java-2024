import java.util.Scanner;

public class RollNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll[] = new int[5];
        System.out.println("Enter roll no of 5 stuydents: ");
        for (int i = 0; i < 5; i++) {
            roll[i] = sc.nextInt();
        }
        int maths[] = new int[5];
        int phys[] = new int[5];
        int chem[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter maths marks of student " + roll[i]);
            maths[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter phys marks of student " + roll[i]);
            phys[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter chem marks of student " + roll[i]);
            chem[i] = sc.nextInt();
        }
        int total[] = new int[5];
        for (int i = 0; i < 5; i++) {
            total[i] = maths[i] + phys[i] + chem[i];
        }
        // arranging the total array in ascending order:
        for (int i = 0; i < 4; i++) {
            if (total[i + 1] < total[i]) {
                int temp = total[i];
                total[i] = total[i + 1];
                total[i + 1] = temp;
            }
        }
        System.out.println("The total marks of each student is : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(total[i] + " ");
        }
        System.out.println("The maximum marks belong to " + roll[4]);
    }
}
