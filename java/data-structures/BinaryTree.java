// Each node contains value and pointers to both left and right node
class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinaryTree {
    // Root node of the Binary Tree
    Node root;

    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.println(node.value + " ");
            inorderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        // Creating binary tree
        BinaryTree tree = new BinaryTree();

        // Adding nodes to tree
        tree.root = new Node(10);                       //       10
        tree.root.left = new Node(5);                   //      /  \
        tree.root.right = new Node(15);                 //     5    15
        tree.root.left.left = new Node(3);              //    / \
        tree.root.left.right = new Node(7);             //   3   7

        // Traversing binary tree
        System.out.println("Inorder Traversal: ");
        tree.inorderTraversal(tree.root);
    }
}
