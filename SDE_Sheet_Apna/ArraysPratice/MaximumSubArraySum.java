package SDE_Sheet_Apna.ArraysPratice;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int arr[]={5,4,-1,7,8};
        int ar=getMaxSum(arr);
        System.out.println(ar);
    }
    public static int getMaxSum(int arr[])
    {
        int t=arr[0];
        int ft=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            t=Math.max(t+arr[i],arr[i]);
            System.out.println(t);
            ft=Math.max(t,ft);
            System.out.println(ft);
            System.out.println("\n");
        }
        return ft;
    }
}
