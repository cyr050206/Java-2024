public class tostring {
    public static void main(String[] args) {
        car ob = new car();
        System.out.println(ob.bruh());
    }
}

class car {
    String name = "Ford";
    int year = 2020;
    String type = "SUV";

    public String bruh() {

        return name + "\n" + year + "\n" + type;
    }
}
