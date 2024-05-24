
import java.util.*;

// Class definition for finding the lowest common ancestor in a binary tree
public class approach2_Lca {

    // Definition of the Node class representing a node in the binary tree
    static class Node {
        int data;     // Data stored in the node
        Node left;    // Reference to the left child node
        Node right;   // Reference to the right child node

        // Constructor to initialize a node with given data
        public Node(int data){
            this.data = data;   // Assign the provided data to the node
            this.left = null;   // Initialize left child as null
            this.right = null;  // Initialize right child as null
        }
    }
   
    // Method to find the lowest common ancestor (LCA) of two nodes in the binary tree
    public static Node optimizedLca(Node root, int n1, int n2){

        // Base case: If the root is null or if either n1 or n2 matches the root, return root
        if(root == null || root.data == n1 || root.data == n2  ){
            return root;
        }

        // Recursively search for n1 and n2 in the left and right subtrees
        Node leftLca = optimizedLca(root.left,n1,n2);
        Node rightLca = optimizedLca(root.right,n1,n2);

        // If leftLca is null, return rightLca (indicating both n1 and n2 are in the right subtree)
        if(leftLca == null){
            return rightLca;
        }
        // If rightLca is null, return leftLca (indicating both n1 and n2 are in the left subtree)
        if(rightLca == null){
            return leftLca;
        }

        // If both leftLca and rightLca are not null, root is the LCA
        return root;
    }

    // Main method
    public static void main(String args[]){

        // Construct the binary tree
        Node root = new Node(1);           // Root node with value 1
        root.left = new Node(2);           // Left child of root with value 2
        root.right = new Node(3);          // Right child of root with value 3
        root.left.left = new Node(4);      // Left child of node 2 with value 4
        root.left.right = new Node(5);     // Right child of node 2 with value 5
        root.right.left = new Node(6);     // Left child of node 3 with value 6
        root.right.right = new Node(7);    // Right child of node 3 with value 7

        // Example binary tree:
        /*
                    1
                   / \
                  /   \
                 2     3
                / \   / \
               4   5 6   7
        */

        // Find the lowest common ancestor of nodes 4 and 7
        System.out.println(optimizedLca(root,4,7).data);  // Print the value of the LCA

    }   
}
