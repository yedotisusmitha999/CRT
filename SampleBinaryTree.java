
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTree {
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    int countLeafNodes(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    int sumOfNodes(Node root) {
        if (root == null) return 0;
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    int findMax(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        int maxLeft = findMax(root.left);
        int maxRight = findMax(root.right);
        return Math.max(root.data, Math.max(maxLeft, maxRight));
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.right = new Node(40);

        System.out.print("Inorder Traversal: ");
        tree.inorder(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(root);
        System.out.println();

        System.out.println("Total number of nodes: " + tree.countNodes(root));
        System.out.println("Number of leaf nodes: " + tree.countLeafNodes(root));
        System.out.println("Sum of all nodes: " + tree.sumOfNodes(root));
        System.out.println("Maximum element: " + tree.findMax(root));
    }
}
