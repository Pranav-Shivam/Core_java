package First;

import java.util.Scanner;

public class Tower_of_Hanoi {
    public static void TOH(int n,String SRC,String MID, String DEST) {
        if (n == 1) {
            System.out.printf("Move the disk: %d : from : %s : to : %s :",n,SRC,DEST);
            System.out.println();
            return;
        }
        TOH(n-1,SRC,DEST,MID);
        System.out.printf("Move the disk: %d : from : %s : to : %s :",n,SRC,DEST);
        System.out.println();
        TOH(n-1,MID,SRC,DEST);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of disk ");
        int n=sc.nextInt();
        TOH(n,"Source-A","Helper-B","Destination-C");
    }
}
