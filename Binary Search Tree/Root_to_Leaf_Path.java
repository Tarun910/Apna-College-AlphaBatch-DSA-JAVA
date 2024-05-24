

ERROR

// import java.util.*;

// public class Root_to_Leaf_Path {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         // constructor
//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static void printPath(ArrayList<Integer> path){
//         for(int i=0; i<path.size(); i++){
//             System.out.print(path.get(i) + "->");
//         }
//         System.out.println("NUll");
//     }
    
//    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
//   if(root == null){
//     return;
//   }
//     path.add(root.data);
//     if(root.left == null && root.right == null){
//         printPath(path);
//     }
//     printRoot2Leaf(root.left, path);
//     printRoot2Leaf(root.right, path);
//     path.remove(path.size()-1);
//    }

    


   

//     public static void main(String args[]) {

//         int values[] = { 8, 5, 3, 6, 10, 11, 14 };
//         Node root = null;
        

//        printRoot2Leaf(root, new ArrayList<>());

//     }
// }
