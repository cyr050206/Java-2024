public class factrec {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int ans = fact(n);
        System.out.println(ans);
    }

    static int fact(int n) {
        // int ans = 1;
        while (n > 0) {
            return n * fact(n - 1);
        }
        return n;
    }
}
