import java.util.Scanner;

public class stringllen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr string:");
        String n = sc.nextLine();
        try{
            checklen(n);
        }
        catch(Exception e){
            System.out.println("EXCEPTION OCCURED HONK HONK"+e);
        }
        
        sc.close();
    }
    static void checklen(String n)throws Exception{
        if(n.length()>10){
            throw new LengthException("TOO LONG BRUHH");
        }
        else{
            System.out.println("GOOD TO GO!");
        }
    }
}
class LengthException extends Exception{
    LengthException(String message){
        System.out.println(message);
    }
}
