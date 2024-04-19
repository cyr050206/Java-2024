public class somepowerig {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int g = power(a,b);
        System.out.println("The ans is "+g);

    }
    static int power(int n, int x){
        if(x==0){
            return 1;
        }
        else{
            return n * power(n, x-1); 
        }
    }
}
