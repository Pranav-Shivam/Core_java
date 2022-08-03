package SDE_Sheet_Apna.ArraysPratice;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int arr[]={1,-7,2,8,4,-11,6,5,3,9,0};
        int ar=getMaxSum(arr);
        System.out.println(ar);
    }
    public static int getMaxSum(int arr[])
    {
        int t=arr[0];
        int ft=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            t=Math.max(t+arr[i],arr[i]);
            ft=Math.max(t,ft);
        }
        return ft;
    }
}
