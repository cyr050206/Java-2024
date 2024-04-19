import java.util.*;
class Staff {
    public static void main(String[] args) {
        Staff staff = new Staff();
        Scanner sc = new Scanner(System.in);
        int code;
        String name;
        Teacher teacher = new Teacher();
        Officer officer = new Officer();
        Typist typist = new Typist();
        System.out.println("Enter the typist speed");
        typist.speed = sc.nextInt();
        System.out.println("Enetr his experience in years: ");
        typist.exp = sc.nextInt();
        System.out.println("What sub does the Teacher teach?");
        teacher.sub = sc.nextLine();
        System.out.println("Enter the officers department: ");
        officer.dept = sc.nextLine();
        System.out.println("Enter his grade: ");
        officer.grade = sc.next().charAt(0);
        System.out.println("Enter the salary of the Regular Typist");
        typist.sala=sc.nextInt();
}
}
class  Typist extends Staff{
    int sala;
    Regular regular = new Regular(sala);
    int speed;
    int exp;
}
class Teacher extends Staff{
    String sub;
    int exp;
void read(){

}
void display(){
}
}
class Officer extends Staff{
String dept;
char grade;
void read(){

}
void display(){

}
}
class Regular extends Typist{
 int sal;
 Regular(int sal){
   
 }
void read(){
    this.sal = sal;
}
void display(){

}
}
class Casual extends Typist{
int daily_wages;
void read(){

}
void display(){

}
}

