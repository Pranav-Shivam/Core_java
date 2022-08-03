package First;

import java.util.*;
public class ZigzagMatrix {
    public static void main(String[] args)
    {
        int n = 5, m = 4;
        int[][] arr={
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 },
        };

        // Function call
        diagonalOrder(arr, n, m);

    }
    public  static  void diagonalOrder(int arr[][],int n,int m)
    {
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>(m+n-1);
        for (int i = 0; i < m+n-1; i++) {
            list.add(new ArrayList<Integer>());
        }
        for (int i = 0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                list.get(i+j).add(arr[i][j]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.get(i).size()-1; j >=0; j--) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
