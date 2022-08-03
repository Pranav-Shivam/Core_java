package First;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class FullBinaryTree {
    public static void main(String[] args) {
        FullBinaryTree fbt=new FullBinaryTree();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of node you want to find ");
        int n=sc.nextInt();
        List<BinaryNode> bt=fbt.allPosssible(n);
        System.out.println(bt);
    }
    public List<BinaryNode> allPosssible(int n)
    {
        return helper(n);
    }
    public List<BinaryNode> helper(int n)
    {
        if (n == 1) {
            ArrayList<BinaryNode> base=new ArrayList<>();
            base.add(new BinaryNode(0));
            return base;
        }
        List<BinaryNode> ans=new ArrayList<>();
        for (int i = 1; i < n; i+=2) {
            List<BinaryNode> left=helper(i);
            List<BinaryNode> right=helper(n-i-1);
            for (BinaryNode l:left) {
                for (BinaryNode r:right) {
                    BinaryNode root=new BinaryNode(0);
                    root.left=l;
                    root.right=r;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}
