import java.util.Scanner;

public class CustomException {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        try{
        checkAge(age);
    }
    catch(Exception e){
        System.out.println("An error occured: "+e);
    }
}
    static void checkAge(int age) throws AgeException{
        if(age<18){
            throw new AgeException();
        }
        else
        {
            System.out.println("You are successfully signed up!");
        }
    }
    
}
class AgeException extends Exception {
    AgeException(){
        
    }
}

