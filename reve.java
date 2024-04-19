import java.util.Scanner;
interface Reversal{
    String rever(String s);
}
class reve implements Reversal{
    public String rever(String s){
        String t = s;
        StringBuilder ob = new StringBuilder(t);
        ob.reverse();
         return ob.toString();
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        Reversal reversal = new reve();
        String rev = reversal.rever(s);
        System.out.println("string is "+rev);
        sc.close();
    }
}

