import java.util.*;
public class Second_largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int large=0;
        int slarge=0;
        System.out.println("Enter the length of the array ");
        int l=sc.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter the array elemnt ");
        for (int i = 0; i < l; i++) {
            arr[i]=sc.nextInt();
        }
        int idx=0;
        //int small=arr[0];
        sc.close();
        for (int i = 0; i < l; i++) {
            if (large<arr[i]) {
                large=arr[i];
                idx=i;
            }
        }
        arr[idx]=0;
        for (int i = 0; i < l; i++) {
            if (slarge<arr[i]) {
                    slarge=arr[i];
            }
        }
        System.out.println("Largest no. is "+large);
        System.out.println("Second largest no. is "+slarge);
    }
}
