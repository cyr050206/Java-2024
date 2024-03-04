public class RecursionFromCMD {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        Power ob = new Power(a, b);
        int x = ob.pow(a, b);
        ob.display(x);
        // int power(int a, int b){
        // int x;
        // return power(x,b-1)
        // }
    }
}

class Power {
    int x = 0, y;
    int r;

    Power(int a, int b) {

        x = a;
        y = b;
    }

    int pow(int x, int y) {

        if (y > 1) {

            return x * pow(x, y - 1);
        }
        {
            return x;
        }

    }

    void display(int r) {
        System.out.println("The ans is " + r);
    }
}
