import java.util.Scanner;

public class evennumexc {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        try {
            checkeven(n);
        } catch (Exception e) {

        }
        sc.close();
    }

    static void checkeven(int n) throws Exception {

        if(n%2 == 0){
            throw new EvenException("Even number bruhhh");
        }
        else{
            throw new OddException("NIgga odd!");
        }
       // throw new UnsupportedOperationException("Unimplemented method 'checkeven'");
    }
}
class OddException extends Exception{
    OddException(String message){
        super();
        System.out.println(message);
    }
}
class EvenException extends Exception {
    EvenException(String message){
        super();
        System.out.println(message);
    }
    
}