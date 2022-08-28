package SDE_Sheet_Apna.StringPratice;

import java.util.Arrays;

public class nextPremutationString {
    public static void main(String[] args) {
        char ch[]={'a','b','c','d','e'};
        new nextPremutationString().nextPremutation(ch);
        System.out.println(Arrays.toString(ch));

    }
    public void nextPremutation(char arr[])
    {
        if(arr==null || arr.length<=1)
        {
            return;
        }
        int l=arr.length;
        int i=l-2;
        while(i>=0 && arr[i]>=arr[i+1])
        {
            i--;
        }
        if(i>=0)
        {
            int j=l-1;
            while (arr[j]<=arr[i])
            {
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,l-1);
//        for (char ch:arr) {
//            System.out.print(ch+" -> ");
//        }
    }
    public void swap(char arr[],int i,int j)
    {
        char t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public void reverse(char arr[],int i,int j)
    {
        while(i<j)
        {
            swap(arr,i++,j--);
        }
    }
}
