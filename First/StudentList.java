package First;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StudentList {
    public static void main(String args[])
    {
        Set<Student_Set> std=new HashSet<>();
        std.add(new Student_Set("Pranav",9,78));
        std.add(new Student_Set("Shivam",8,77));
        std.add(new Student_Set("Ram",1,100));
        System.out.println(std);
        Set<Student_Set> std1=new LinkedHashSet<>();
        std1.add(new Student_Set("Pranav",9,78));
        std1.add(new Student_Set("Shivam",8,77));
        std1.add(new Student_Set("Ram",1,100));
        System.out.println(std1);
//        Set<First.Student_Set> std2=new TreeSet<>();
//        std2.add(new First.Student_Set("Pranav",9,78));
//        std2.add(new First.Student_Set("Shivam",8,77));
//        std2.add(new First.Student_Set("Ram",1,100));
//        System.out.println(std2);
    }
}
