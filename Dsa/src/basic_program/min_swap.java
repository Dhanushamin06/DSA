package basic_program;

public class min_swap {
    public static class Solution {
        public int minimumSwaps(int[] nums) {
            int count = 0;
            int notzeros = 0;
            int temp;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {

                    notzeros++;
                }
            }

            for (int i = 0; i < notzeros; i++) {
                if (nums[i] == 0) {
                    count++;
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = { 0, 0, 1, 2, 4, 0, 3 };
        System.out.println(s.minimumSwaps(arr));
    }
}
