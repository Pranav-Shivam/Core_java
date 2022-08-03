package First;

import java.util.Stack;
public class Stack_Learn {
    public static void main(String args[])
    {
        Stack<String> animals=new Stack<>();
        animals.push("Lion");
        animals.push("tiger");
        animals.push("cat");
        animals.push("Dog");
        System.out.println("Stacks"+animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println("Stacks"+animals);
        System.out.println(animals.peek());
    }
}
