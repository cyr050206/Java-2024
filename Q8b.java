 class Q8b {
  int a;
    Q8b(){
    a=10;  
    }
    void play(){
      System.out.println("Hello!");
    }
    
    
    public static void main(String[] args) {
      Q8bsub ob = new Q8bsub();
      ob.play();
    }
    
}
class Q8bsub extends Q8b{
  
  Q8bsub(){
    super();
  }
 void show(){
  a++;
  }
  void display(){
    a++;
    System.out.println("Value of a is "+a);
}
}
