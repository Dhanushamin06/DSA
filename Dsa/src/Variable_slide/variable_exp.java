package Variable_slide;

public class variable_exp {
    public static void valid_sub_array(int arr[], int k) {
        int l = 0;
        int win_sum = 0;
        int maxlen = 0;
        for (int r = 0; r < arr.length; r++) {
            win_sum += arr[r];
            while (win_sum > k && l <= r) {
                win_sum -= arr[l];
                l++;
            }
            if (win_sum <= k) {
                maxlen = Math.max(maxlen, r - l + 1);
            }
        }
        System.out.println("maxlen:" + maxlen);
        for (int i = l; i <= l + maxlen; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 4 };
        int k = 6;
        valid_sub_array(arr, k);

    }
}
