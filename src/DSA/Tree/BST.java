package DSA.Tree;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if (root == null){
           root = new Node(val);
           return root;
        }
        if(root.data > val){
            root.left = insert(root.left,val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
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
        inOrder(root.right);
        System.out.println(root.data + " ");
        inOrder(root.left);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return  false;
        }

        if (root.data > key ){
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }

    }


    public static void main(String[] args) {
        int value[] = {5,1,9,3,4,11,8,2,14,7};
        Node root = null;

        for(int i =0; i < value.length; i++ ){
            root = insert(root, value[i]);
        }

        //Node print
        inOrder(root);
        postOrder(root);

        //search
        if (search(root,21)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found!");
        }
    }

}
