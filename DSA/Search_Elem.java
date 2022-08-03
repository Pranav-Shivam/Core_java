import java.util.*;

public class Search_Elem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array ");
        int len=sc.nextInt();
        int arr[]=new int[len];
        int index=-1;
        boolean flag=false;
        System.out.println("Enter the element we want to search ");
        int key=sc.nextInt();
        System.out.println("Enter the array element s \n");
        for (int i = 0; i < len; i++) {
            System.out.println("Enter new element ");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < len; i++) {
            if(key==arr[i])
            {
                index=i;
                flag=true;
                break;
            }
        }
        sc.close();
        if (flag==true)
            System.out.printf("%d is at arr[%d] \n",key,index);
        else
            System.out.println("Element not found");
    }
}
