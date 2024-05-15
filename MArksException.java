import java.util.Scanner;

public class MarksException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks =sc.nextInt();
        try{
        checkMarks(marks);
    }
    catch(Exception e){
        //System.out.println("Exception has occured: "+e);
    }
}
    static void checkMarks(int marks)throws MarksOutOfBoundsException{
        if(marks>100){
            throw new MarksOutOfBoundsException("AN EXCEPTION OCCURED:");
        }
        else{
            System.out.println("You have scored "+marks+" marks");
        }
    }
}
class MarksOutOfBoundsException extends Exception{
    MarksOutOfBoundsException(String message){
        super(message);
       // System.out.println(message);
    }
}
