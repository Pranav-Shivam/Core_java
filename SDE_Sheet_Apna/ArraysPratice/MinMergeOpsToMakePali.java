package SDE_Sheet_Apna.ArraysPratice;

public class MinMergeOpsToMakePali {
    public static void main(String[] args) {
        int arr[]={1,4,3,9,1};
        System.out.println(findMinOps(arr, arr.length));
    }
    public static boolean isPali(int arr[])
    {
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i]!=arr[arr.length-i-1])
            {
                return false;
            }
        }
      return true;
    }
    public static int findMinOps(int arr[],int l)
    {
        int ct=0;
        int start=0;
        int end=l-1;
        while (start<end)
        {
            if(arr[start]>arr[end])
            {
                end--;
                arr[end]+=arr[end+1];
                ct++;
            }
            else if(arr[start]==arr[end])
            {
                end--;
                start++;
            }
            else
            {
                start++;
                arr[start]+=arr[start-1];
                ct++;
            }
        }
        return ct;
    }
}
