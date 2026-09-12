package Variable_slide;

import java.util.Scanner;

public class defuse_bomb {
   public int[] decrypt(int[] code, int k) {
      int sum = 0;
      int n = code.length;
      int[] result = new int[code.length];
      if (k == 0) {
         return result;
      } else if (k > 0) {

         for (int i = 1; i <= k; i++) {
            sum += code[i % n];
         }
         for (int i = 0; i < n; i++) {
            result[i] = sum;
            sum -= code[(i + 1) % n];
            sum += code[(i + 1 + k) % n];
         }
      } else {
         k = -k;
         for (int i = 1; i <= k; i++) {
            sum += code[(n - i) % n];
         }
         for (int i = 0; i < n; i++) {
            result[i] = sum;
            sum -= code[(i - k + n) % n];
            sum += code[i % n];
         }
      }
      return result;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      defuse_bomb d = new defuse_bomb();
      int n = sc.nextInt();
      int[] code = new int[n];
      for (int i = 0; i < n; i++) {
         code[i] = sc.nextInt();
      }
      int k = sc.nextInt();
      int[] result = d.decrypt(code, k);
      for (int i = 0; i < n; i++) {
         System.out.print(result[i] + " ");
      }

   }
}
