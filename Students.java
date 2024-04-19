import java.util.Scanner;

public class Students {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int id;
        int phys;
        int chem;
        int maths;
        System.out.println("Enter no of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name: ");
            name = sc.next();
            System.out.println("Enter ID");
            id = sc.nextInt();
            System.out.println("Enter phys marks: ");
            phys = sc.nextInt();
            System.out.println("Enter chem marks: ");
            chem = sc.nextInt();
            System.out.println("Enter maths marks: ");
            maths = sc.nextInt();
            students[i] = new Student(name, id, phys, chem, maths);
        }
        Student temp;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].total < students[j + 1].total) {
                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < students.length; i++) {
            students[i].display(i);
        }
        sc.close();
    }
}

class Student {
    String name;
    int id;
    int phys;
    int chem;
    int maths;
    int total;

    /*Student() {
    };*/

    Student(String name, int id, int phys, int chem, int maths) {
        this.name = name;
        this.id = id;
        this.phys = phys;
        this.chem = chem;
        this.maths = maths;
        this.total = phys + chem + maths;
    }

    void display(int i) {
        System.out.println("Rank #" + (i + 1));
        System.out.println("The name is " + name + " ID: " + id);
        // System.out.println("The ID is " + id);
        System.out.println("Phys marks: " + phys);
        System.out.println("Chem marks: " + chem);
        System.out.println("Math marks: " + maths);
        System.out.println("Total marks: *" + total + "*");
    }

}
