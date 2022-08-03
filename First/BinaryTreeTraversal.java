package First;

public class BinaryTreeTraversal {
    static BinaryNode root;
    BinaryTreeTraversal()
    {
        root=null;
    }
    public static void preOrder(BinaryNode node)
    {
        if (node == null) {
            return;
        }
        System.out.print(node.data+"->");
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void postOrder(BinaryNode node)
    {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+"->");
    }
    public static void inOrder(BinaryNode node)
    {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+"->");
        inOrder(node.right);

    }
    public static void main(String[] args)
    {
        BinaryTreeTraversal tree=new BinaryTreeTraversal();
        tree.root=new BinaryNode(1);
        tree.root.left=new BinaryNode(12);
        tree.root.right=new BinaryNode(15);
        tree.root.left.left=new BinaryNode(14);
        tree.root.left.right=new BinaryNode(28);
        tree.root.right.left=new BinaryNode(17);
        tree.root.right.right=new BinaryNode(23);
        tree.root.left.left.left=new BinaryNode(2);
        tree.root.left.left.right=new BinaryNode(3);

        System.out.println("Pre Order");
        tree.preOrder(root);
        System.out.println();
        System.out.println("Post Order");
        tree.postOrder(root);
        System.out.println();
        System.out.println("In Order");
        tree.inOrder(root);
    }
}
