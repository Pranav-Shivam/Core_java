package First;

import java.util.*;
public class Student_Set implements Comparable<Student_Set>{
    String name;
    int rollNo;
    int marks;
    public Student_Set(String nm,int r,int m)
    {
        name=nm;
        rollNo=r;
        marks=m;
    }

    @Override
    public String toString() {
        return "First.Student_Set{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student_Set that = (Student_Set) o;
        return rollNo == that.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public int compareTo(Student_Set that) {
        return this.rollNo- that.rollNo;  //this.name.compareTo(that.name);
    }
}
