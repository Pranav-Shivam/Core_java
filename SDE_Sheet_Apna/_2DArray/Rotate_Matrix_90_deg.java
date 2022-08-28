package SDE_Sheet_Apna._2DArray;

public class Rotate_Matrix_90_deg {
    public static void main(String args[]) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void rotate(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int t=0;
                t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            for (int j = 0; j < arr.length/2; j++) {
                int k= arr.length-j-1;
                int t=0;
                t=arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=t;
            }
        }
    }
}
