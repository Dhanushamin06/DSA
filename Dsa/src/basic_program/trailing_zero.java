package basic_program;

import java.util.*;

//logic of trailing zero is we have to divide the given number with power of 5 and get the quotient and after we combine the quotient we get total trailing zero
public class trailing_zero {
    public static int trail_zero(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trail_zero(n));
    }
}