package basic_program;

import java.util.*;

class pascal_triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) +
                            triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        pascal_triangle pt = new pascal_triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numRows = sc.nextInt();
        List<List<Integer>> triangle = pt.generate(numRows);
        System.out.println(triangle);
    }
}