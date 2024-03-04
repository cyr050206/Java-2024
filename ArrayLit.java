import java.util.*;

public class ArrayLit {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Cyrus");
        food.add("Papul");
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
