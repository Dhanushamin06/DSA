import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void hashfunction(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int value : map.keySet()) {
            System.out.printf("%d---->%d\n", value, map.get(value));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        hashfunction(num);

    }
}
