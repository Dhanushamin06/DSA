package XOR;

import java.util.Scanner;
import java.util.Arrays;

public class single_num {
    public static int singlenum(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = Arrays.stream(sc.nextLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(singlenum(nums));
    }

}
