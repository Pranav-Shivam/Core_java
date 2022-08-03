package First;

import java.util.Scanner;

public class Interface_Eg implements Client {

   String name;
   int roll;
   double marks;

    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        name=sc.nextLine();
        System.out.println("Enter roll no.");
        roll=sc.nextInt();
        System.out.println("Enter marks ");
        marks=sc.nextDouble();
    }
    public void output()
    {
        System.out.println(name+" "+roll+" "+marks);
    }

    public static void main(String[] args) {
        Client c=new Interface_Eg();
        c.input();
        c.output();
    }
}
