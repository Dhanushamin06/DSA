package basic_program;

import java.util.Scanner;

public class sliding_window {
    public static int sum_sub_array(int[] arr, int k) {
        int left = 0;
        int max;
        int curr = 0;
        if (arr.length < k) {
            return -1;
        }
        for (int r = 0; r < k; r++) {
            curr += arr[r];
        }
        max = curr;
        for (int r = k; r < arr.length; r++) {
            curr = curr + arr[r] - arr[left];
            max = Math.max(curr, max);
            left++;
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the subarray");
        int k = sc.nextInt();
        System.out.println("The maximum sum of the subarray of size " + k + " is " + sum_sub_array(arr, k));

    }
}