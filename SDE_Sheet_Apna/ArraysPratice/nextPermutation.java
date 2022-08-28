package SDE_Sheet_Apna.ArraysPratice;
import java.util.*;
public class nextPermutation {
    public static void main(String[] args) {
        int arr[]={1,3,5,4,2};
        nextPrem(arr);
        for (int x:arr) {
            System.out.print(x+" ");;
        }
        //System.out.println(fact(5));
    }

    static void nextPrem(int arr[])
    {
        if(arr==null || arr.length<=1)
        {
            return;
        }
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1])
        {
            i--;
        }
        if(i>=0)
        {
            int j= arr.length-1;
            while(arr[j]<=arr[i])
            {
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1, arr.length -1);
//        for (int x:arr
//             ) {
//            System.out.print(x+" > ");
//        }

    }
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int arr[],int i,int j)
    {
        while(i<j)
        {
            swap(arr,i++,j--);
        }
    }

}
