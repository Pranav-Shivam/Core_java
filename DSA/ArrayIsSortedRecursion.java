package DSA;

public class ArrayIsSortedRecursion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,6,6,8};
        boolean flag=isSorted(arr,0);
        System.out.println(flag);
    }
    public static boolean isSorted(int arr[],int i)
    {
        if(arr.length==0 || i==arr.length-1)
        {
            return true;
        }
        if (arr[i]>arr[i+1])
            return false;
        return isSorted(arr,i+1);
    }
}
