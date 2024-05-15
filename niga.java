import java.util.Vector;

public class niga {
    
public static void main(String[] args) {
    Vector<Integer> vector = new Vector<Integer>(10);
    vector.add(10);
    vector.add(20);
    vector.add(30);
    vector.add(540);
    System.out.println(vector);
    try{
    for(int i=0;i<10;i++){
        System.out.println(vector.get(i));
    }
}
catch(Exception e){
}
}
}
