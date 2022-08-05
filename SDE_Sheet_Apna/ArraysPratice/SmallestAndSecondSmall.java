package SDE_Sheet_Apna.ArraysPratice;

public class SmallestAndSecondSmall {
    public static void main(String[] args) {
        int arr[]={03,2,14,5,6,4};
        int n= arr.length;
        int small=arr[0];
        int k=0;
        //int secSmall=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            if(small>arr[i])
            {
                small=arr[i];
                k=i;
            }
        }
        arr[k]=Integer.MAX_VALUE;
        int secSmall=arr[0];
        for(int i=1;i<n;i++)
        {
            if(secSmall>arr[i])
            {
                secSmall=arr[i];
            }
        }
        arr[k]=small;
        System.out.println(small+"      "+secSmall);
    }
}
