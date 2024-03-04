
//package diceroll;
//import java.util.*;
import java.util.*;

public class Dice {
    public static void main(String[] args) {
        DiceRoller diceRoller = new DiceRoller();
        diceRoller.die();
        // System.out.println(diceRoller());
    }
}

class DiceRoller {
    Random random;
    int number;

    DiceRoller() {

    }

    void die() {
        random = new Random();
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}