package array;

public class roman_to_integer {
    public long int_rom(String s) {
        int[] arr = new int[128];
        arr['I'] = 1;
        arr['V'] = 5;
        arr['X'] = 10;
        arr['L'] = 50;
        arr['C'] = 100;
        arr['D'] = 500;
        arr['M'] = 1000;
        int total = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int curr = arr[s.charAt(i)];
            if (i + 1 < n && curr < arr[s.charAt(i + 1)]) {
                total -= curr;

            } else {
                total += curr;
            }

        }
        return total;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        roman_to_integer i = new roman_to_integer();
        System.out.println(i.int_rom(s));
    }

}
