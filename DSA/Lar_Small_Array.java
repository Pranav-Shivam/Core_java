import java.util.*;
public class Lar_Small_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int large=0;
        System.out.println("Enter the length of the array ");
        int l=sc.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter the array elemnt ");
        for (int i = 0; i < l; i++) {
            arr[i]=sc.nextInt();
        }
        int small=arr[0];
        sc.close();
        for (int i = 0; i < l; i++) {
            if(small>arr[i]) {
                small=arr[i];
            }
            if (large<arr[i]) {
                large=arr[i];
            }
        }
        System.out.println("Largest no. is "+large);
        System.out.println("Smallest no. is "+small);
    }
}