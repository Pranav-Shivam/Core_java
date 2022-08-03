package First;

import java.util.*;

public class OrderWiseStudent {
    public static void main(String args[])
    {
        List<Student_Set> std=new ArrayList<>();
        std.add(new Student_Set("Pranav",9,78));
        std.add(new Student_Set("Shivam",8,77));
        std.add(new Student_Set("Ram",1,100));
        std.add(new Student_Set("Hanuman",6,78));
        std.add(new Student_Set("Shiv",7,77));
        std.add(new Student_Set("Rama",5,40));
        std.add(new Student_Set("Sita",4,68));
        std.add(new Student_Set("Shiva",3,77));
        std.add(new Student_Set("RaDha",2,10));
        //System.out.println(std);
        Collections.sort(std);
        System.out.println(std);
        Collections.sort(std, new Comparator<Student_Set>() {
            @Override
            public int compare(Student_Set s1, Student_Set s2) {
                return s1.name.compareTo(s2.name);
            }
        });
        System.out.println(std);
//        Set<First.Student_Set> std1=new LinkedHashSet<>();
//        std1.add(new First.Student_Set("Pranav",9,78));
//        std1.add(new First.Student_Set("Shivam",8,77));
//        std1.add(new First.Student_Set("Ram",1,100));
//        System.out.println(std1);
//        Set<First.Student_Set> std2=new TreeSet<>();
//        std2.add(new First.Student_Set("Pranav",9,78));
//        std2.add(new First.Student_Set("Shivam",8,77));
//        std2.add(new First.Student_Set("Ram",1,100));
//        System.out.println(std2);
    }
}
