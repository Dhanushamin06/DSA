public class common_prefix {
    public String longest_common_prefix(String[] s) {

        String prefix = s[0];
        for (int i = 1; i < s.length; i++) {
            while (!prefix.startsWith(s[i])) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        common_prefix c = new common_prefix();
        String[] s = { "flower", "flow", "flight" };
        System.out.println(c.longest_common_prefix(s));
    }
}
