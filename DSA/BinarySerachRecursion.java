package DSA;

public class BinarySerachRecursion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=6;
        int index=binarySerach(arr,k,0, arr.length-1);
        System.out.println(index);
    }
    static int binarySerach(int arr[],int key,int start,int end)
    {
        if (start > end) {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==key)
        {
            return mid;
        }
        if(key<arr[mid])
        {
            return binarySerach(arr,key,start,mid-1);
        }
        else
        {
            return binarySerach(arr, key, mid+1, end);
        }

    }
}
