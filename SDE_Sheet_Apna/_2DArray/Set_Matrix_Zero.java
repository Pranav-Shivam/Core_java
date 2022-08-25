package SDE_Sheet_Apna._2DArray;

import java.util.*;

public class Set_Matrix_Zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int row=sc.nextInt();
        System.out.println("Enter Col");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter ele");
                arr[i][j]=sc.nextInt();

            }
        }
        Set_Matrix_Zero obj=new Set_Matrix_Zero();
        obj.matrix_0(arr);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
    public void matrix_0(int arr[][])
    {
        int m= arr.length;
        int n=arr[0].length;
        int col0=0;
        for(int i=0;i<m;i++)
        {
            if(arr[i][0]==0)
            {
                col0=0;
            }
            for (int j = 1; j < n; j++) {
                if(arr[i][j]==0)
                {
                    arr[i][0]=0;
                    arr[0][i]=0;
                }
            }
        }
        for (int i = m-1; i >=0 ; i--) {
            for (int j = n-1; j >=1 ; j--) {
                if (arr[i][0]==0 || arr[0][j]==0)
                {
                    arr[i][j]=0;
                }
            }
            if(col0==0)
            {
                arr[i][0]=0;
            }
        }
    }
}
