package DSA.Tree;
import java.util.Queue;
import java.util.LinkedList;

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

    public static int preOrder(Node root){
        if(root == null){
            return -1; // return -1 for null node
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

        return root.data;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        System.out.println(root.data + " ");
        postOrder(root.right);
    }

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>(); // Create a queue to perform level order traversal
        q.add(root); // Add the root node to the queue
        q.add(null); // Add a null marker to indicate the end of the current level

        while(!q.isEmpty()){
            Node currNode = q.remove(); //Remove the front node from the queue

            if(currNode == null){
                System.out.println(); //End of one level, print newline
                if(q.isEmpty()){
                    break; // If queue is empty after popping null, traversal is complete
                } else {
                    q.add(null); // Add another null marker for the next level
                }
            } else {
                System.out.print(currNode.data + " "); // Print current node's data
                if(currNode.left != null){
                    q.add(currNode.left); // Add left child to queue if it exists
                }
                if(currNode.right != null){
                    q.add(currNode.right); // Add right child to queue if it exists
                }
            }
        }
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static void main(String[] args) {

        //Array ,-1 indicates a null (no node)
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // Build the binary tree and get the root node
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Root node data: " + root.data); // Expected output: 1

        System.out.println("preOrder:- ");
                preOrder(root);
        System.out.println("inOrder:- ");
                inOrder(root);
        System.out.println("postOrder:- ");
                postOrder(root);
        System.out.println("levelOrder:- ");
                levelOrder(root);
        System.out.println("countNodes:- " + countNodes(root));

    }
}