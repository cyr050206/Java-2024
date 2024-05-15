import java.util.Scanner;

public class ThreadMultiplication {
    public static void main(String[] args) throws InterruptedException {
        tab11 table1 = new tab11();
        tab7 table2 = new tab7();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter sybmol 1:");
      char s1 =sc.next().charAt(0);
      char s2=sc.next().charAt(0);
        table1.start();
    //  table1.join();
        table2.start();
    }
    
}
class tab11 extends Thread{
    public void run(char c){
        for(int i=1;i<=10;i++){
         //   System.out.println("11 x "+i+" = "+i*11);
         System.out.print("/");
         try{
            Thread.sleep(4);
         }
         catch(Exception e){

         }
        }
        
    }

    
}
class tab7 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.print("*");
            try{
                Thread.sleep(4);
             }
             catch(Exception e){
    
             }
            // System.out.println("7 x "+i+" = "+i*7);
        }
        
    }
}
