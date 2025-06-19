package DSA.Tree;

public class Tree {

    //Representing a node
    static class Node {
        int data;      // Value stored in the node
        Node left;     // Reference left child
        Node right;    // Reference right child

        Node(int data) {
            this.data = data;
            this.left = null;   // Initially, no left child
            this.right = null;  // Initially, no right child
        }
    }

    // Static inner class to build and manage the binary tree
    static class BinaryTree {
        static int idx = -1; // Keeps track of current index in the input array

        // Method to build the binary tree recursively
        public static Node buildTree(int nodes[]) {
            idx++; // Move to the next index in the array

            // Base case: if current value is -1, return null (no node)
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]); // Create a new node with current data
            newNode.left = buildTree(nodes); // Recursively build left subtree
            newNode.right = buildTree(nodes); // Recursively build right subtree

            return newNode;
        }
    }

    public static void main(String[] args) {

        //Array ,-1 indicates a null (no node)
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // Build the binary tree and get the root node
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Root node data: " + root.data); // Expected output: 1
    }
}