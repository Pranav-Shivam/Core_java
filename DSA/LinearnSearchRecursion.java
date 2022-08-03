package DSA;

public class LinearnSearchRecursion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=91;
        int index=linearSearch(arr,k,0, arr.length-1);
        System.out.println(index);
    }
    public static int linearSearch(int arr[],int key,int start,int end){
        if (arr == null || start>end) {
            System.out.println("So soorry! key not found ");
            return -1;
        }
        if (arr[start]==key)
        {
            System.out.print("Key is found at index ");
            return start;
        }
        return linearSearch(arr,key,start+1,end);
    }
}
