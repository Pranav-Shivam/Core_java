package com.company;

import java.util.Scanner;

public class Telephone {
    String name;
    int call;
    boolean staff;
    double bill;

    public Telephone() {
        name = "";
        call = 0;
        staff = false;
        bill = 0.0;

    }

    public Telephone(String name, int call, boolean staff, double bill) {
        this.name = name;
        this.call = call;
        this.staff = staff;
        this.bill = bill;
    }

    public void calc() {
        int c = call;
        if (!staff) {
            if (c >= 0 && c <= 100) {
                bill = call * 0;
            } else if (c >= 101 && c <= 200) {
                bill = call * 0.80;
            } else if (c >= 201 && c <= 400) {
                bill = call;
            } else if (c >= 401) {
                bill = call * 1.20;
            }
            bill = bill * (105 / 100);
        } else {
            if (c >= 0 && c <= 400) {
                bill = call * 0;
            } else if (c >= 401) {
                bill = call * 1.20;
            }
            bill = bill * (105 / 100);
        }
    }

}
class BillCalcuation
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Telephone t=new Telephone();
        System.out.println("Enter the name of subscriber :");
        t.name= sc.nextLine();
        System.out.println("Enter the no. of call ");
        t.call=sc.nextInt();
        System.out.println("Enter the type of subscriber (staff=true,subscriber=false) ");
        t.staff=sc.nextBoolean();
        t.calc();

        System.out.println("\nThe total bill of subscriber is "+t.bill);
    }
}
