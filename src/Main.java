public class Main {

    static int a;
    static int b;
    static double res;

    public static void main(String[] args) {
        System.out.println("My git app. Super!");

        a = 12;
        b = 4;

        res = add(a, b);
        System.out.println("The sum is: " + res);
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
