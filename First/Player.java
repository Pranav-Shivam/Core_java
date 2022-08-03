package First;

import java.util.Objects;

public class Player implements Comparable<Player>{
    String name;
    int marks;
    public Player(String nm,int m)
    {
        name=nm;

        marks=m;
    }

    @Override
    public String toString() {
        return "First.Student_Set{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return marks == player.marks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marks);
    }

    @Override
    public int compareTo(Player that) {
        return this.marks-that.marks;
    }
}
