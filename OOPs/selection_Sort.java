package OOPs;

import java.util.Arrays;

public class selection_Sort {
    public static void main(String[] args) {
        int arr[]={7, 9, 11, 12, 5,2,8};
        int len= arr.length;
        selection_Sorts(arr,len);
        int x=(int)Arrays.binarySearch(arr,11);
        System.out.println(x+"\n");
        System.out.println(Arrays.toString(arr));
        var t=15;
        System.out.println(t+15);
    }

    public static void selection_Sorts(int[] arr,int l) {
        int i,j,pos;
        for (i = 0; i < l-1; i++) {
            pos=i;
            for (j = i+1; j <l ; j++) {
                if(arr[j]<arr[pos])
                {
                    pos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
        }
    }
}
