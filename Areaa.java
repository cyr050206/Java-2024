abstract class Calculater{
    abstract int getArea(int a, int b);
}
class Areaa extends Calculater {
    int getArea(int b, int h){
        return b*h;
    }
    public static void main(String args[]){
        int b = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        Areaa ob = new Areaa();
        int area = ob.getArea(b,h);
        System.out.println("Area is "+area);    
    }
    
    }
   
