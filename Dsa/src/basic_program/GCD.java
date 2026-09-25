package basic_program;

public class GCD {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }

    public static void main(String[] args) {
        GCD g = new GCD();
        System.out.println(g.gcd(34, 45));
    }
}