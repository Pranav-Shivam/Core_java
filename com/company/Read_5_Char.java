package com.company;

import java.util.Scanner;

public class Read_5_Char {
      char a,b,c,d,e;

    public  void read_5_Char(char x, char y, char z, char p, char q) {
        a=x;
        b=y;
        c=z;
        d=p;
        e=q;
    }
    public  void print_5_char()
    {
        System.out.println("First Character "+a);
        System.out.println("Second Character "+b);
        System.out.println("Third Character "+c);
        System.out.println("Fourth Character "+d);
        System.out.println("Fifth Character "+e);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all five Character ");
        char a=sc.next().charAt(0),b=sc.next().charAt(0),c=sc.next().charAt(0),d=sc.next().charAt(0),e=sc.next().charAt(0);
        Read_5_Char r=new Read_5_Char();
        r.read_5_Char(a,b,c,d,e);
        r.print_5_char();
    }
}
