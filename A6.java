
class A7{
    public void show() {
        System.out.println("Crack in A7");
    }
    public void flash(){
        System.out.println("Black in A7!");
    }
}
class A8{
    public void show(){
        System.out.println("Crack but A8");
    }
    public void flash(){
        System.out.println("Black but A8!");
    }
}
class A6{
  

    public static void main(String args[]) {
        A7 obj = new A7();
        A8 obk = new A8();
        obj.show();
        obj.flash();
        obk.show();
        obk.flash();
    }
    
}