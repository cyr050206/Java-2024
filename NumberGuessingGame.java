
import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ManvsComp ob = new ManvsComp();
        System.out.println("WHALECUM!!!!"); 
        
        System.out.println("What do you want to do?");
        System.out.println("1: Man VS Man");
        System.out.println("2: Man VS Computer");
        System.out.println("3: Computer VS Computer");
        System.out.println("Enter your choice!");
        int choice  = sc.nextInt();
        if(choice == 1){
            
           
        }   
        else if(choice == 2){
            ob.NumGenerate();
        } 
        else if(choice ==3){

        }
        else{
            System.out.println("bro what");
        }
    }
}

class ManvsComp extends NumberGuessingGame{
    void NumGenerate(){
        int comp_num = (int)(Math.random()*100)+1;
        
    }    
}
