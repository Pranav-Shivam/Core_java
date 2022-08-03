package First;

import java.util.*;

public class LearnCustomPriorityQueue {
    public static void main(String[] args) {
        EmpComparator comp=new EmpComparator();
        PriorityQueue<EmployeeCust> queue=new PriorityQueue<>(10,comp);
        queue.add(new EmployeeCust("Pranav",5000));
        queue.add(new EmployeeCust("Shivam",2000));
        queue.add(new EmployeeCust("Pranav",4000));
        queue.add(new EmployeeCust("Tomar",1000));
        System.out.println(queue.peek());
    }
}
class EmployeeCust
{
    String name;
    int sal;

    public EmployeeCust(String name,int sal) {
        this.name=name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "EmployeeCust{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
class EmpComparator implements Comparator<EmployeeCust>
{
    @Override
    public int compare(EmployeeCust o1, EmployeeCust o2) {
        return o1.sal-o2.sal;
    }
}
