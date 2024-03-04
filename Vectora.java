import java.util.*;

public class Vectora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int x = 0;
        System.out.println("Enter value of n: ");
        n = sc.nextInt();
        Vector<String> name = new Vector<String>(n);
        name.add("Cyrus");
        name.add("Alice");
        name.add("James");
        name.add("Amita");
        System.out.println();
        System.out.println("Enter a new String: ");
        String neww = sc.next();
        for (int i = 0; i < name.size(); i++) {
            if (name.get(i) == neww) {
                name.remove(i);
                x++;
            } /* */
        }

        System.out.println("New one is: ");
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
        sc.close();
    }
}
