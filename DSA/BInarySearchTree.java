package DSA;

import java.util.*;

public class BInarySearchTree {
    static class BSTNode {
        int data;
        BSTNode left, right;

        BSTNode(int key) {
            data = key;
            left = right = null;
        }
    }

    static BSTNode insertRec(BSTNode root, int key) {
        if (root == null) {
            root = new BSTNode(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    static void inOrderREc(BSTNode root) {
        if (root != null) {
            inOrderREc(root.left);
            System.out.print(root.data + " > ");
            inOrderREc(root.right);
        } else {
            //System.out.print();
            return;
        }
    }

    public static boolean search(BSTNode root, int key) {
        if (root == null) {
            System.out.print("search not found");
            return false;
        }
        if (root.data < key) {
            return search(root.right, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.left, key);
        }
    }

    public static BSTNode deleteNode(BSTNode root, int val) {
        if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else if (root.data < val) {
            root.right = deleteNode(root.right, val);
        }
        //root.data=val
        else {
            //case1
            if (root.right == null && root.left == null) {
                return null;
            }
            //case2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

//            case3
            BSTNode IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }
        return root;
    }

    public static BSTNode inorderSuccessor(BSTNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(BSTNode root, int n1, int n2) {
        if (root == null) {
            return;
        }
        if (root.data >= n1 && root.data <= n2) {
            printInRange(root.left, n1, n2);
            System.out.print(root.data + " > ");
            printInRange(root.right, n1, n2);
        } else if (root.data >= n2) {
            printInRange(root.left, n1, n2);
        } else {
            printInRange(root.right, n1, n2);
        }
    }

    public static void printRoot2Leaf(BSTNode root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.right == null && root.left == null) {
            printPath(path);
        } else {
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " > ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BInarySearchTree tree = new BInarySearchTree();
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 8, 6, 4, 7, 5, 3, 9, 2};
        int n = arr.length;
        BSTNode root = null;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            root = insertRec(root, x);
        }
        inOrderREc(root);
        System.out.println("\nElement is searched ");
        System.out.println(search(root, 7));
        System.out.println();
        deleteNode(root, 6);
        inOrderREc(root);
        System.out.println("\nPrinting value in range");
        printInRange(root, 4, 8);
        System.out.println("\nPrinting  root to leaf all path");
        printRoot2Leaf(root,new ArrayList<>());
    }
}
