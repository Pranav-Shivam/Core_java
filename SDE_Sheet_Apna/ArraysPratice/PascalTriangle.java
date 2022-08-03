package SDE_Sheet_Apna.ArraysPratice;

import java.util.*;

public class PascalTriangle {
//    public static void main(String[] args) {
//        int row=5;
//        List<List<Integer>> li=pascalTri(row);
////        for (int i = 0; i < row; i++) {
////            for (int j = 0; j < i+1; j++) {
////                System.out.print(li.get(i).get(j));
////            }
////            System.out.println();
////        }
//        pascalTr(row);
//    }

    public static List<List<Integer>> pascalTri(int n) {
        int pascal[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            int row[] = new int[i + 1];
            for (int j = 1; j < i; j++) {
                row[j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
            pascal[i] = row;
        }
        return (List) Arrays.asList(pascal);
    }

    public int factorial(int i) {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        int n = 5, i, j;
        PascalTriangle g = new PascalTriangle();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {

                // for left spacing
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {

                // nCr formula
                int ncr=g.factorial(i) / (g.factorial(i - j) * g.factorial(j));
                System.out.print(" " + ncr);
            }

            // for newline
            System.out.println();
        }
    }


}
