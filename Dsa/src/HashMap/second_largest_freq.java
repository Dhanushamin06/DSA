import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class second_largest_freq {

    public static int hashFreq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int val : map.values()) {
            if (val > max) {
                smax = max;
                max = val;
            } else if (val > smax && val != max) {
                smax = val;
            }
        }
        return smax;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Second largest frequency is:" + hashFreq(num));
    }
}
