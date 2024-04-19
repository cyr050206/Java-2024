//Interface declaration: by first user  
interface Drawable {
    void draw();
    int x = 4; 
}

class Rectangle implements Drawable {
    
    public void draw() {
         
        System.out.println("Drawing rectangle");
    }
}
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing circle");
    }
}
class TestInterface1 {
        public static void main(String args[]) {
        Drawable d,d1;
        d = new Rectangle();
        d1 = new Circle();
       // d.x=5;
        System.out.println(d.x);
        d.draw();
        d1.draw();
    }
}