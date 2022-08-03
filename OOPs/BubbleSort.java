package OOPs;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={7, 9, 11, 12, 5,2,8};
        int len= arr.length;
        BubbleSort.bubbleSort(arr,len);
        System.out.println(Arrays.toString(arr));
    }
    public  static void bubbleSort(int arr[],int l)
    {
        for (int i = 0; i < l-1; i++)
        {
            for (int j = 0; j < l-i-1; j++)
            {
                if (arr[j] >arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
