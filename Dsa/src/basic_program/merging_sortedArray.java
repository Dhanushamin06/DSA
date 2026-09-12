import java.util.Scanner;

public class merging_sortedArray {
    public static void merge(int nums1[], int m, int nums2[], int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int m = s.nextInt();
        System.out.println("\nEnter the size of second array:");
        int n = s.nextInt();
        int nums1[] = new int[m + n];
        int nums2[] = new int[n];
        System.out.println("\nEnter the elements of first array:");
        for (int i = 0; i < m + n; i++) {
            nums1[i] = s.nextInt();
        }
        System.out.println("\nEnter the elements of second array:");
        for (int i = 0; i < n; i++) {
            nums2[i] = s.nextInt();
        }
        merge(nums1, m, nums2, n);
        System.out.println("\nSorted array:");
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }

    }
}
