package First;

import java.util.*;

public class SettingMatrixZero {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of row");
        int r=sc.nextInt();
        System.out.println("Enter the no of column");
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%3d ",arr[i][j]);
            }
            System.out.println();
        }
        insertZero(arr,r,c);
    }
    public static void insertZero(int matrix[][],int n, int m)
    {
        int arr[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j]==0) {
                    for (int k = 0; k < m; k++) {
                        arr[i][k] = 0;
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]==0)
                {
                    for (int k = 0; k < n; k++) {
                        arr[k][i]=0;
                    }
                }
                //break;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d ",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
