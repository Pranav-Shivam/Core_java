package First;

import java.util.Scanner;

public class ThreePointsMakeTriange {
    static class Point
    {
        int x, y;
        Point(int a,int b)
        {
            x=a;
            y=b;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the points for p");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Point p=new Point(x,y);
        System.out.println("Enter the points for q");
        Point q=new Point(sc.nextInt(), sc.nextInt());
        System.out.println("Enter the points for r");
        Point r=new Point(sc.nextInt(), sc.nextInt());
        int t=checkTriangle(p,q,r);
        if(t==1)
        {
            System.out.println("Yes points can form triangle");
        }
        else
        {
            System.out.println("Points are collinear ");
        }
    }
    public static int checkTriangle(Point p,Point q,Point r)
    {
        int AB=distance(p,q);
        int BC=distance(q,r);
        int AC=distance(p,r);
        if(AB+BC==AC)
        {
            return 0;
        } else if (AC+BC==AB) {
            return 0;
        } else if (AB+AC==BC) {
            return 0;
        }
        else {
            return 1;
        }
    }
    public static int distance(Point a,Point b)
    {
        int x=Math.abs(a.getX()-b.getX());
        int y=Math.abs(a.getY()-b.getY());
        int d=(int)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return d;
    }
}
