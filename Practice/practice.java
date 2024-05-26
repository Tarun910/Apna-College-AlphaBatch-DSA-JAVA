import java.lang.reflect.Array;
import java.util.*;
import java.util.LinkedList;





// public class practice {

//   static class Node{
//     int data;
//     Node left;
//     Node right;
//     public Node(int data){
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }

//     public static int transform(Node root){
//         if(root == null){
//             return 0;
//         }
//         int leftChild = transform(root.left);
//         int rightChild = transform(root.right);
//         int data = root.data;

//         int newLeft = root.left == null? 0 : root.left.data;
//         int newRight = root.right == null? 0: root.right.data;

//         //changing
//         root.data = newLeft+leftChild+newRight+rightChild;
//         return data;
//     }
//   }


//   //function for printing a tree
//   public static void preorder(Node root){
//     if(root == null){
//         return;
//     }
//     System.out.println(root.data + " ");
//     preorder(root.left);
//     preorder(root.right);
//   }

//     public static void main(String[] args) {
//         /*
//                  1
//                 / \
//                /   \
//               2     3
//              / \   / \
//             4   5 6   7

//          */

//          Node root = new Node(1);
//          root.left = new Node(2);
//          root.right = new Node (3);
//          root.left.left = new Node(4);
//          root.left.right = new Node(5);
//          root.right.left = new Node(6);
//          root.right.right = new Node(7);
         
        
//     }
// }




// public class practice {

//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;

//         }
//     }

//     //function to calculate sum of tree
//     public static int sum(Node root){
//         //base case
//         if(root == null){
//             return 0;
//         }

//         int leftSum = sum(root.left);
//         int rightSum = sum(root.right);
//         int sum = leftSum + rightSum + root.data;
//         return sum;
//     }
//     //function to calculate hieght
//     public static int height(Node root){
//         //base case
//         if(root == null){
//             return 0;
//         }
//         int leftHeight = height(root.left);
//         int rightHeight = height(root.right);
//         return Math.max(leftHeight, rightHeight)+1;

//     }

//     //function to calculate number of nodes
//     public static int count(Node root){
//         //base case
//         if(root == null){
//             return 0;
//         }
//         int leftCount = count(root.left);
//         int rightCount = count(root.right);
//         int tree = leftCount + rightCount + 1;
//         return tree;

//     }

//     //function to find the last common ancestor
//     ;



//     public static void main(String[] args) {
//         /*
//                  1
//                 / \
//                /   \
//               2     3
//              / \   / \
//             4   5 6   7

//          */


//          Node root = new Node(1);
//          root.left = new Node(2);
//          root.right = new Node(3);
//          root.left.left = new Node(4);
//          root.left.right = new Node(5);
//          root.right.left = new Node(6);
//          root.right.right = new Node(7);



//     }
// }



// public class practice {
    
//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;


//         }

//     }

//     public static Node build(Node root,int val){
//         if(root == null){
//             root = new Node(val);
//             return root;
//         }

//         if(root.data >val){
//             root.left = build(root.left, val);
//         }

//         if(root.data<val){
//             root.right = build(root.right,val);

//         }

//         return root;
//     }

//     public static void inorder(Node root){
//         if(root == null){
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }


//     public static boolean search(Node root, int key){

//         if(root == null){
//             return false;
//         }
//         if(root.data == key){
//             return true;
//         }
//         if(root.data>key){
//             return search(root.left,key);
//         }
//         else{
//             return search(root.right, key);
//         }
    

//     }

//     public static void main(String[] args) {
//         int values[] = {5,1,3,4,2,7};
//         Node root = null;
//         int key = 7;
//         int n = values.length;
//         for(int i=0; i<n; i++){
//             root = build(root, values[i]);
//         }
//         inorder(root);
//         System.out.println();

//         if(search(root, 7)){
//             System.out.println("True");
//         }else{
//             System.out.println("False");
//         }

    

//     }





// public class practice {

//      static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;


//         }
//     }

//     public static Node CreateMirror(Node root){
//         if(root == null){
//             return null;
//         }

//         Node leftMirror = CreateMirror(root.left);
//         Node rightMirror = CreateMirror(root.right);

//         root.left = rightMirror;
//         root.right = leftMirror;

//         return root;
//     }

//     public static void preOrder(Node root){
//         if(root == null){
//             return;
//         }
//         System.out.print(root.data + " ");
//         preOrder(root.left);
//         preOrder(root.right);
//     }

//     public static void main(String[] args) {

//         Node root = new Node(8);
//         root.left = new Node(5);
//         root.right = new Node(10);
//         root.left.left = new Node(3);
//         root.left.right = new Node(6);
//         root.right.right = new Node(11);

//         preOrder(root);
//         CreateMirror(root);
//         System.out.println();
//         preOrder(root);

        
//     }
// }



// public class practice {

//     static class Node{
//         int data;
//         Node left;
//         Node right;
        
//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;

//         }
//     }

//     public static void preOrder(Node root){
//         if(root == null)
//         return;

//         System.out.print(root.data + " ");
//         preOrder(root.left);
//         preOrder(root.right);

//     }

//     public static Node createBST(int arr[], int st, int end){
//         if(st>end){
//             return null;
//         }

//         int mid = (st+end)/2;
//         Node root = new Node(arr[mid]);
//        root.left = createBST(arr, st, mid-1);  
//         root.right = createBST(arr, mid+1, end);

//         return root;
//       }

//     public static void main(String[] args) {
//         int arr[] = {3,5,6,8,10,11,12};
//         Node root = createBST(arr, 0, arr.length-1);
//         preOrder(root);
        
//     }
// }





// public class practice {

//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }




//     public static Node mergeBST(Node root1, Node root2){

//          //step1 make sorted array of both trees
//     ArrayList<Integer> arr1 = new ArrayList<>();
//     getInorder(root1, arr1);

//     //step2
//     ArrayList<Integer> arr2 = new ArrayList<>();
//     getInorder(root2, arr2);

    
//     //merge
//     int i=0; int j=0;
//     ArrayList<Integer> finalArr = new ArrayList<>();
//     while(i<arr1.size() && j<arr2.size()){
//         if(arr1.get(i) <= arr2.get(j)){
//             finalArr.add(arr1.get(i));
//             i++;
//         }else{
//             finalArr.add(arr2.get(j));
//             j++;
//         }
//     }

//     while(i<arr1.size()){
//         finalArr.add(arr1.get(i));
//         i++;
//     }
//     while(j<arr2.size()){
//         finalArr.add(arr2.get(j));
//         j++;
//     }

//     //sorted AL ->balanced BST
//     return createBST(finalArr, 0, finalArr.size()-1);

//     }
   

//     public static void preOrder(Node root){
//         if(root == null){
//             return;
//         }
//         System.out.print(root.data + "");
//         preOrder(root.left);
//         preOrder(root.right);
        
//     }

//     public static void getInorder(Node root, ArrayList<Integer> arr){
//         if(root == null){
//             return;
//         }
//         getInorder(root.left, arr);
//         arr.add(root.data);
//         getInorder(root.right, arr);

//     }

//     public static Node createBST(ArrayList<Integer> arr, int st, int end){
//         if(st > end){
//             return null;
//         }
//         int mid = (st+end)/2;
//         Node root = new Node(arr.get(mid));
//         root.left = createBST(arr, st, mid-1);
//         root.right = createBST(arr, mid + 1,end );
//         return root;

//     }



//     public static void main(String[] args) {

//          /*
//          * 2
//          * / \
//          * 1 4
//          * BST1
//          */
//         Node root1 = new Node(2);
//         root1.left = new Node(1);
//         root1.right = new Node(2);


//          /*
//          * 9
//          * / \
//          * 3 12
//          * 
//          * BST 2
//          */

//          Node root2 = new Node(9);
//          root2.left = new Node(3);
//          root2.right = new Node(12);


//          Node root = mergeBST(root1, root2);
//          preOrder(root);  
        
//     }
// }




// public class practice {

//     static class Student implements Comparable<Student>{
//         int rank;
//         String name;
//         public Student(String name, int rank){
//             this.name = name;
//             this.rank = rank;
//         }

//         //to make function comparable
//         @Override
//         public int compareTo(Student s2){
//             return this.rank  - s2.rank;
//         }
//     }

//     public static void main(String[] args) {
//         PriorityQueue<Student> pq = new PriorityQueue<>();
//         pq.add(new Student("A", 4));
//         pq.add(new Student("B", 5));
//         pq.add(new Student("C", 2));
//         pq.add(new Student("D", 12));

//         while(!pq.isEmpty()){
//             System.out.print(pq.peek().name + "->" + pq.peek().rank);
//             System.out.println();
//             pq.remove();
//         }
        
//     }
// }





// public class practice {

//     static class Heap{
//         ArrayList<Integer> arr = new ArrayList<>();
//         public void add(int data){
//             arr.add(data);
//             int x = arr.size()-1;
//             int par = (x-1)/2;

//             while(arr.get(x) < arr.get(par)){
//                 //swap
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);
//             }
//         }
//     }

//     //peek operation
//     public int peek() {
//         return arr.get(0);
//     }


//     public static void main(String[] args) {
//         Heap h = new Heap();
//         h.add(3);
//         h.add(4);
//         h.add(1);
//         h.add(5);
//         h.add(2);

        
        
//     }
// }





// public class practice {

//     static class Point implements Comparable<Point>{
//         int x,y;
//         int distSq;
//         int idx;
//         public Point(int x, int y, int distSq, int ids){
//             this.x = x;
//             this.y = y;
//             this.distSq = distSq;
//             this.idx = idx;


//         }

//         @Override
//         public int compareTo(Point p2){
//             return distSq - s2.distSq;
//         }
//     }

//     public static void main(String[] args) {
//         int pts[][] = {{3,3}, {5,-1}, {-2,4}};
//         int k = 2;
//         PriorityQueue<Point> list = new PriorityQueue<>();
//         for(int i=0; i<pts.length; i++){
//             int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
//         }
        
//     }
// }







// public class practice {
//     public static void main(String[] args) {
//         int arr[] = {1,3,2,5,1,3,1,5,1};
//         int n = arr.length;
//         HashMap<Integer, Integer> map = new HashMap();

//         for(int i = 0; i<n; i++){
//             int num = arr[i];
//             map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
            
//         }

//         for(Integer key : map.keySet()){
//             if(map.get(key) > (n/3)){
//                 System.out.println(key);
//             }
//         }
//     }
    
// }






/**
 * practice
 */
// public class practice {

//     public static void main(String[] args) {
//         HashMap<String,Integer>hm = new HashMap<>();
//         hm.put("orange", 1);
//         hm.put("mango", 2);
//         hm.put("apple", 3);
//         hm.put("banana", 4);
//         System.out.println(hm);


//         //to iterate we use a set by making a set of keys
//         Set<String> keys = hm.keySet();
//         System.out.println(keys);



//         for(String k : keys){
//             System.out.println("key="+ k + "value" + hm.get(k));
//         }
//     }
// }

/**
 * practice
 */


 /**
  * practice
  */
//  public class practice {

//     public static boolean anagram(String s1, String s2){
//         if(s1.length() != s2.length()){
//             return false;

//         }
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(int i=0; i<s1.length(); i++){
//             char ch = s1.charAt(i);
//             map.put(ch,map.getOrDefault(ch,0)+1);

//         }

//         for(int i=0; i<s2.length(); i++){
//             char ch = s2.charAt(i);
//             if(map.get(ch)!=null){
//                 if(map.get(ch) == 1){
//                     map.remove(ch);
//                 }else{
//                     map.put(ch,map.get(ch)-1);
//                 }
//             }else{
//                 return false;
//             }
//         }
//         return map.isEmpty();

//     }
 
//     public static void main(String[] args) {
//         String s1 = "Kneemmandar", s2 = "Keenmands";

//         System.out.println(anagram(s1,s2));
        
//     }
//  }



/**
 * practice
 */
/**
 * practice
 */

// public class practice {
//     public static boolean anagram(String s1, String s2){
//         if(s1.length() != s2.length()){
//             return false;
//         }
//         HashMap<Character, Integer> map = new HashMap<>();

//         for(int i=0; i<s1.length() i++){
//             char ch = s1.charAt(i);
//             map.put(ch,map.getOrDefault(ch, 0) + 1);
//         }

//         for(int i=0; i<s2.length(); i++){
//             char ch = s2.charAt(i);
//             if(map.get(ch) == 1){
//                 map.remove(ch);

//             }else{
//                 map.put(ch, map.get(ch)-1);

//             }


//         }
//         else{
//             return false;
//         }
        
//         return map.isEmpty();

//     }


//     public static void main(String[] args) {
//         String s1 = "care", s2 = "rare";
//         System.out.println((s1,s2));
        
        
//     }
// }


/**
 * practice
 */
// public class practice {

//     public static void main(String[] args) {
        
//         HashSet<Integer> hs = new HashSet<>();
//         hs.add(1);
//         hs.add(2);
//         hs.add(3);
//         hs.add(4);
//         hs.add(1);
//         System.out.println(hs);
//         System.out.println(hs.remove(1));
//         System.out.println(hs);
//         System.out.println(hs.isEmpty());
//         hs.clear();
//         System.out.println(hs);
// System.out.println(hs.isEmpty());
       
//     }
// }


/**
 * practice
 */




 /**
  * practice
  */
//  public class practice {
 
//     public static void main(String[] args) {
//         int arr1[] = {7,3,9};
//         int arr2[] = {6,3,9,2,9,4};
//         HashSet<Integer> hs = new HashSet<>();
//         for(int i=0; i<arr1.length; i++){
//             hs.add(arr1[i]);
//         }

//         for(int i=0; i<arr2.length; i++){
//             hs.add(arr2[i]);
//         }

//         System.out.println(hs.size());
//         hs.clear();

//         for(int i=0; i<arr1.length; i++){
//             hs.add(arr1[i]);
//         }
        
//         int count = 0;
//         for(int i=0; i<arr2.length; i++){
//             if(hs.contains(arr2[i])){
//                 count++;
//                 hs.remove(arr2[i]);

//             }
//         }
//         System.out.println(count);



//     }
//  }



/**
 * practice
 */
// public class practice {

//     public static String getStart(HashMap<String,String> tickets){
//         //we will make a reverse Hashmap
//         HashMap<String,String> revMap = new HashMap<>();

//         for(String i : tickets.keySet()){
//             revMap.put(tickets.get(i), i);
//         }
//         for(String i : tickets.keySet()){
//             if(!revMap.containsKey(i)){
//                 return i;
//             }
//         }
//         return null;
//     }

//     public static void main(String[] args) {
//         HashMap<String,String> tickets = new HashMap<>();
//         tickets.put("chennai", "bengaluru");
//         tickets.put("Mumbai", "Delhi");
//         tickets.put("goa", "chennai");
//         tickets.put("delhi", "goa");

//         String start = getStart(tickets);
//         System.out.println(start);


//         for(String key : tickets.keySet()){
//             System.out.println("--->" + tickets.get(start));
//             start = tickets.get(start);

//         }
//     }
// }



/**
 * practice
 */



 /**
  * practice
  */
//  public class practice {

//   static class Edge{
//     int src;
//     int dest;
//     int wt;

//     public Edge(int s, int d, int w){
//       this.src = s;
//       this.dest = d;
//       this.wt = w;
//     }
//   }
 
//   public static void main(String[] args) {

//     int V = 5;
//     ArrayList<Edge>[] graph = new ArrayList[V];

//     //creating arraylist at each array
//     for(int i=0; i<V; i++){
//       graph[i] = new ArrayList<>();

//     }

//     //at 0-vertex
//     graph[0].add(new Edge(0,1,5));

//     //at 1-vertex
//     graph[1].add(new Edge(1,0,5));
//     graph[1].add(new Edge(1,2,1));
//     graph[1].add(new Edge(1,3,1));


//     //at 2-vertex
//     graph[2].add(new Edge(2,1,1));
//     graph[2].add(new Edge(2, 3, 1));
//     graph[2].add(new Edge(2, 4, 2));

//     //at 3-vertex
//     graph[3].add(new Edge(3, 1, 3));
//     graph[3].add(new Edge(3, 2, 1));

//     //at 4-vertex
//     graph[4].add(new Edge(4, 2, 3));


//     //now printing the neighbours of 2 vertex

//     for(int i=0; i<graph[2].size(); i++){
//       Edge e = graph[2].get(i);
//       System.out.println(e.dest);
//     }




    
//   }
//  }



/**
 * practice
 */
// public class practice {

//   static class Edge{
//     int src;
//     int dest;
//     int wt;
//     public Edge(int s, int d, int w){
//       this.src = s;
//       this.dest = d;
//       this.wt = w;

//     }
//   }

//   public static void main(String[] args) {
//     int v = 5;
//     ArrayList<Edge>[] graph = new ArrayList[v];

//     //creating arralist at each array
//     for(int i=0; i<v; i++){
//       graph[i] = new ArrayList<>();
//     }

//     //0th - vertex
//     graph[0].add(new Edge(0, 1, 5));
    
//     //1th - vertex
//     graph[1].add(new Edge(1, 2, 1));
//     graph[1].add(new Edge(1, 2, 1));
//     graph[1].add(new Edge(1, 3, 1));

//     //at 2-vertex
//     graph[2].add(new Edge(2, 1, 1));
//     graph[2].add(new Edge(2, 3, 1));
//     graph[2].add(new Edge(2, 4, 2));

//     //at 3-vertex
//     graph[3].add(new Edge(3, 1, 3));
//     graph[3].add(new Edge(3, 2, 1));
  
//     //at 4-vertex
//     graph[4].add(new Edge(4, 2, 3));

//     //now printing the neighbours of 2 vertex

//     for(int i=0; i<graph[2].size();i++){
//       Edge e = graph[2].get(i);
//       System.out.println(e.dest);
//     }
    
//   }
// }



/**
 * practice
 */
// public class practice {

//   static class bipartite{
//     int src;
//     int dest;

//     Edge(int s, int d){
//       this.src = s;
//       this.dest = d;
//     }
//   }



//   static void createGraph(ArrayList<Edge> graph[]){
//     for(int i=0; i<graph.length; i++){
//       graph[i] = new Arraylist<>();
//     }

//     graph[0].add(new Edge(0,1));
//     graph[0].add(new Edge(0,2));

//     graph[1].add(new Edge(1,0));
//     graph[1].add(new Edge(1,3));

//     graph[2].add(new Edge(2,0));
//     graph[2].add(new Edge(2,4));

//     graph[3].add(new Edge(3,1));
//     graph[3].add(new Edge(3,4));

//     graph[4].add(new Edge(4,2));
//     graph[4].add(new Edge(4,3));

//   }

//   public static boolean isBipartite(ArrayList<Edge> graph){
//     int col[][] = new int[graph.length];

//     for(int i=0; i<col.length; i++){
//       col[i] = -1;
//     }

//     Queue<Integer> q = new LinkedList<>();
//     for(int i=0; i<graph.length; i++){
//       if(col[i] == -1){
//         q.add(i);
//         col[i] = 0;

//       while(!q.isEmpty()){
//         int curr = q.remove();

//         for(int j=0; j<graph[curr].size(); j++){
//           Edge e = graph[curr].get(j);

//           if(col[e.dest] == -1){
//             int nextCol = col[curr] = 0 ? 1 : 0;
//             col[e.dest] = nextCol;
//             q.add(e.dest);
//           }

//           else if(col[e.dest] == col[curr]){
//             return false;

//           }
//         }

//       }
//       }
//     }
//     return true;
//   }

//   public static void main(String[] args) {
//     int V = 5;
//     ArrayList<Edge> graph[] = new ArrayList[V];
//     createGraph(graph);

//     System.out.println(isBipartite(graph));
    
//   }
// }



/**
 * practice
 */
// public class practice {

//   static class Edge{
//     int src;
//     int dest;
//     int wt;

//     public Edge(int s, int d, int w){
//       this.src = s;
//       this.dest = d;
//       this.wt = w;
//     }

//   }

//   static void creteGraph(ArrayList<Edge> graph[]){
//     for(int i=0; i<graph.length; i++){
//       graph[i] = new ArrayList<>();
//     }

//     graph[0].add(new Edge(0, 1, 1));
//     graph[0].add(new Edge(0,2,1));

//     graph[1].add(new Edge(1, 0, 1));
//     graph[1].add(new Edge(1,3,1));
    

//     graph[2].add(new Edge(2,0,1));
//     graph[2].add(new Edge(2,4,1));

//     graph[3].add(new Edge(3,1,1));
//     graph[3].add(new Edge(3,4,1));
//     graph[3].add(new Edge(3,5,1));

//     graph[4].add(new Edge(4,2,1));
//     graph[4].add(new Edge(4,3,1));
//     graph[4].add(new Edge(4,5,1));

//     graph[5].add(new Edge(5,6,1));
//     graph[5].add(new Edge(5,3,1));
//     graph[5].add(new Edge(5,4,1));

//   }

//   public static void bfs(ArrayList<Edge> graph[]){
//     Queue<Integer> q = new LinkedList<>();
//     boolean vis[] = new boolean[graph.length];
//     q.add(0);

//     while(!q.isEmpty()){
//       int curr = q.remove();
//       if(!vis[curr]){
//         System.out.print(curr + " ");
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++){
//           Edge e = graph[curr].get(i);
//           q.add(e.dest);
//         }
//       }
//     }
//   }

//   public static void main(String[] args) {

//     int V = 7;
//     ArrayList<Edge> graph[] = new ArrayList[V];
//     creteGraph(graph);
//     bfs(graph);
    
//   }
// }



/**
 * practice
 */
// public class practice {

//   static class Edge{
//     int src;
//     int dest;
//     int wt;
  
//     public Edge(int s, int d, int w){
//       this.src = s;
//       this.dest = d;
//       this.wt = w;

//     }
//   }

//   static void createGraph(ArrayList<Edge> graph[]){
//     for(int i=0; i<graph.length; i++){
//       graph[i] = new ArrayList<>();

//     }

//     graph[0].add(new Edge(0,1,2));
//     graph[0].add(new Edge(0,2,1));
    
//     graph[1].add(new Edge(1,0,1));
//     graph[1].add(new Edge(1,3,1));

//     graph[2].add(new Edge(2,0,1));
//     graph[2].add(new Edge(2,4,1));

//     graph[3].add(new Edge(3,1,1));
//     graph[3].add(new Edge(3,4,1));
//     graph[3].add(new Edge(3,5,1));


//     graph[4].add(new Edge(4,2,1));
//     graph[4].add(new Edge(4,3,1));
//     graph[4].add(new Edge(4,5,1));

//     graph[5].add(new Edge(5,6,1));
//     graph[5].add(new Edge(5,3,1));
//     graph[5].add(new Edge(5,4,1));


//   }

//   public static void dfs(ArrayList<Edge>graph[], int curr, boolean vis[]){
//     System.out.print(curr + " ");
//     vis[curr] = true;

//     for(int i=0; i<graph[curr].size(); i++){
//       Edge e = graph[curr].get(i);
//       if(!vis[e.dest]){
//         dfs(graph, e.dest,vis);
//       }
//     }
//   }

//   public static void main(String[] args) {

//     int V = 7;
//     ArrayList<Edge> graph[] = new ArrayList[V];
//     createGraph(graph);
//     dfs(graph, 0, new boolean[V]);
    
//   }
// }





/**
 * practice
 */
// public class practice {

// public static void main(String[] args) {
//   Queue<String> Q1 = new LinkedList<>();
//   Q1.add("LNCT");
//   Q1.add("MCA");
//   Q1.add("LNCTS");
//   System.out.println(Q1);
//   Q1.remove("LNCT");
//   System.out.println(Q1);

//   String rem = Q1.remove();
//   System.out.println(rem);

//   System.out.println("this is peek " + Q1.peek());

//   System.out.println(Q1.isEmpty());

//   while(!Q1.isEmpty()){
//     System.out.println(Q1.peek());
//     Q1.remove();
//   }
// }
// }



/**
 * practice
 */
// public class practice {

//   public static void main(String[] args) {
//     Queue<String> q = new LinkedList<>();
//     q.add("tarun");
//     q.add("tanvi");
//     q.add("ram");
//     q.add("shyaam");
//     System.out.println( q.peek());
//     System.out.println(q.remove());
//     System.out.println(q);
    

//     while(!q.isEmpty()){
//       System.out.println(q.peek());
//       q.remove();
//     }

//     System.out.println(q.isEmpty());
//   }
// }


/**
 * practice
 */
/**
 * practice
 */
// public class practice {
//   public static void reverse(Queue<Integer> q ) {
//     Stack<Integer> s = new Stack<>();
//     while(!q.isEmpty()){
//       s.push(q.remove());

//     }

//     while(!s.isEmpty()){
//       q.add(s.pop());

//     }
//   }

//   public static void main(String[] args) {
//     Queue<Integer> q = new LinkedList<>(); 

//     q.add(1);
//     q.add(2);
//     q.add(3);
//     q.add(4);

//     reverse(q);

//    while(!q.isEmpty()){
//     System.out.print(q.remove() + " ");
//    }
    
//   }
// }
/**
 * practice
 */
// public class practice {


//   public static void reverse(Queue<Integer> q){

//     Stack<Integer> s = new Stack<>();

//     while(!q.isEmpty()){
//       s.push(q.remove());
//     }

//     while(!s.isEmpty()){
//       q.add(s.pop());

//     }
//   }

//   public static void main(String[] args) {
//     Queue<Integer> q = new LinkedList<>();
//     q.add(1);
//     q.add(2);
//     q.add(3);
//     q.add(4);

// System.out.println(q);
//    reverse(q);
//    System.out.println(q);
    
//   }
// }


/**
 * practice
 */
// public class practice {

//   static class Node{
//     int data;
//     Node next;
//     Node(int data){
//       this.data = data;
//       this.next = null;
//     }
//   }

//   static class Queue{
//     static Node head = null;
//     static node tail = null;

//     public static boolean isEmpty(){
//       return tail == null && head == null;

//     }

//     //add

//     public static void add(int data){
//       Node newNode = new Node(data);
//       //
//       if(isEmpty()){
//         head = tail = null;
//         return;
//       }
//       tail.next = newNode;
//       tail = newNode;
//     }
//   }

//   public static void main(String[] args) {
    
//   }
// }                                                                               
/**
 * practice
 */

 /**
  * practice
  */
 

/**
 * practice
 */
/**
 * practice
 */
/**
 * practice
 */
// public class practice {

//   public static void main(String[] args) {
    
//     int arr[] = {7,2,5,1,4};
//     //find the largest element 

 
//     int max = 0;
//    for(int i=0; i<arr.length; i++){
//     for(int j = i+1; j<arr.length; j++){
//       if(arr[i] > arr[j]){
//         max = arr[i];
//       }
//     }
//    }

//    System.out.println("the max element is : " + max);

//   }
// }


/**
 * practice
 */


// public class practice {

//   public static void rotate(int arr[], int d, int n){
//     int temp[] = new int[n];
//     int k = 0;
//     for(int i=d; i<n; i++){
//       temp[k] = arr[i];
//       k++;
//     }

//     for(int i=0; i<d; i++){
//       temp[k] = arr[i];
//       k++;
//     }


//     for(int i=0; i<n; i++){
//       arr[i] = temp[i];

//     }
//   }


//   static void printArr(int arr[] , int n){
//     for(int i=0; i<n; i++){
//       System.out.print(arr[i]+ "");
//     }
//   }
//   public static void main(String[] args) {

//     //java program to rotate an erray 
//     int arr[] = {1,2,3,4,5,6,7};
//     int n = arr.length;
//     int d = 2;

    
//     rotate(arr, d, n);
//     printArr(arr, n);
    
//   }
// }



/**
 * practice
 */
// public class practice {

//   public static void rotate(int arr[], int d , int n){
//     int temp[] = new int[n];
//     int k = 0;
//     for(int i = d; i<n; i++){
//       temp[k] = arr[i];
//       k++;
//     }


//     for(int i=0; i<d; i++){
//       temp[k] = arr[i];
//       k++;
//     }

//     //copying the element of themp[] into arr[]

//     for(int i=0; i<n; i++){
//       arr[i] = temp[i];
//     }

//   }


//   public static void printArr(int arr[] , int n){
//     for(int i=0; i<n; i++){
//       System.out.print(arr[i] + " ");
//     }
//   }

//   public static void main(String[] args) {
    
//     int arr[] = {1,2,3,4,5,6,7};
//     int n = arr.length;
//     int d = 2;
//     rotate(arr, d, n);
//     printArr(arr, n);


//   }
// }





/*
 import java.util.*;

/**
 * Write a Java Program to Compute the Sum of Array Elements.
 */

// public class practice {

//     public static void main(String[] args) {

//     int arr[] = {1,2,3};
//     int sum = 0;
//     for(int i=0; i<arr.length; i++){
//         sum+=arr[i];
//     }
//         System.out.println("the sum is :" + sum);
//     }
// }

// public class practice {

//     public static int arrSum(int arr[]){

//         int sum = 0;
//         for(int i=0; i<arr.length; i++){
//             sum += arr[i];

//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3};
//         arrSum(arr);
//         System.out.println("the sum is " + arrSum(arr));

//     }
// }

/**
 * . Write a Java Program to Find the Largest Element in Array
 */
// public class practice {

//     public static void printArr(int arr[]){
//     for(int i=0; i<arr.length; i++){
//         System.out.print(arr[i] + " ");
//     }

//     }
//     public static int largest(int arr[]){
//         int max = arr[0];
//         for(int i=0; i<arr.length; i++){
//             if(max < arr[i]){
//                 max = arr[i];
//             }
//         }
//        return max;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7};

//       int largestElement = largest(arr);
//       System.out.println(largestElement);

//     }
// }

/**
 * main
 */
// public class practice {

//     public static void main(String[] args) {
//         int arr[] = {1,2,3};
//         int max = arr[0];

//         for(int i=0; i<arr.length; i++){
//             if(max < arr[i]){
//                 max = arr[i];
//             }
//         }

//         System.out.println("the max is : " + max);
//     }

// }

/**
 * main
 */
// public class practice {

//     public static void main(String[] args) {

//         int arr[] = {1,2,3};
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//         for(int i=0; i<arr.length; i++){
//             if(arr[i]> max){
//                 max = arr[i];
//             }
//         }

//         for(int i=0; i<arr.length; i++){
//             if(arr[i] < min){
//                 min = arr[i];
//             }
//         }

//         System.out.println("Max is : " + max);
//         System.out.println("Min is : " + min);
//     }
// }

/**
 * Java Array Program For Array Rotation
 */
// public class practice {
//     public static void rotation(int arr[], int d, int n){

//         int temp[] = new int[n];
//         int k = 0;
//         for(int i=d; i<n; i++){
//             temp[k] = arr[i];
//             k++;
//         }

//         for(int i=0; i<d; i++){

//             temp[k] = arr[i];
//             k++;
//         }

//         //final arr
//         for(int i=0; i<n; i++){
//             arr[i] = temp[i];

//         }
//     }

//     public static void PrintArr(int arr[] , int n){
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7};
//         int d = 2;
//         int n = arr.length;
//         PrintArr(arr, n);
//         rotation(arr, d, n);
//         PrintArr(arr, n);
//     }
// }

/**
 * taking user input for array
 */
// public class practice {

//     public static void userInput(int arr[]){
//         Scanner sc = new Scanner(System.in);
//         int i = 0;
//         while (i < 5) {
//           arr[i] = sc.nextInt();
//           i++;
//         }

//     }

//     public static void reverse(int arr[]){
//         int start = 0;
//         int end = arr.length-1;
//         while(start!=end){
//                 int temp = arr[start];
//                 arr[start] = arr[end];
//                 arr[end] = temp;

//                 start++;
//                 end--;

//         }
//     }

//     public static void printArr(int arr[]){
//        for(int i=0; i<arr.length; i++){
//         System.out.print(arr[i] + " ");
//        }
//        System.out.println();

//     }

//     public static void main(String[] args) {

//         int arr[] = new int[5];

//         System.out.println("enter the elements");

//         //taking input from the user
//         userInput(arr);

//         //print the arr
//         System.out.println("The elements are : ");
//         printArr(arr);

//        //now reverse it
//        reverse(arr);

//        //print reverse order
//        System.out.println("The reverse elements are : ");
//        printArr(arr);

//       }
//     }




/*
public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter input");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The element are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int start = 0;
        int end = arr.length - 1;
        while (start != end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("the revered order is");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
  */

  

  /**
   * practice
   */
//   public class practice {
  
//     public static void main(String[] args) {
//         //sum of array
//         int arr[] = {1,2,3};
//         int sum = 0;
//         for(int i=0; i<arr.length; i++){
//             sum+=arr[i];
//         }
//         System.out.println("The sum of the array is : " + sum);
//     }
//   }


/**
 * practice
 */
// public class practice {

//     public static int arrSum(int arr[] ){
        
//         int sum = 0;
//         for(int element : arr){
//             sum += element;
//         }

//         return sum;

//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3};
//         System.out.println("The sum is : " + arrSum(arr));
        
//     }
// }


/**
 * practice
 */
// public class practice {

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7};
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         for(int element : arr){
//             if(element > max){
//                 max = element;

//             }
//             if(element <min){
//                 min = element;
//             }
//         }

//         System.out.println("the max is " + max);
//         System.out.println("the min is " + min);
//       }
// }


/**
 * practice
 */
// public class practice {

//     public static int largest_Element(int arr[]){

//         int max = arr[0];
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
        

//        return max;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7};
//        int le= largest_Element(arr);
//        System.out.println("largest element is " + le);

        
//     }
// }


/**
 * practice
 */
// public class practice {

//     public static int missing_element(int arr[], int n){
//         int idealSum = (n*(n+1)/2);
//         int actualSum = 0;
//         for(int i=0; i<arr.length; i++){
//             actualSum+=arr[i];
        
//         }
        
//         return idealSum - actualSum;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,5};
//         int n = 5;

//         int m = missing_element(arr, n);
//         System.out.println(m);
//     }
// }



/**
 * practice
 */
// public class practice {

//     public static void userInput(int arr[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter elements");
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//         }

//     }

//     public static void reverseArray(int arr[]){

//         int start =0;
//         int end = arr.length-1;
//         while(start != end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }

//     public static void printArr(int arr[]){
//         for(int element : arr){
//             System.out.print(element + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//        int arr[] = new int[7];
//        userInput(arr);
//         printArr(arr);
//         reverseArray(arr);
//         printArr(arr);


//     }
// }


/**
 * practice
 */
// public class practice {

//     public static void rotation(int arr[], int d, int n){

//         int temp[] = new int[n];
//         int k=0;
//         for(int i=d; i<arr.length; i++){
//             temp[k] = arr[i];
//             k++;
//         }

//         for(int i=0; i<d; i++){
//             temp[k] = arr[i];
//             k++;
//         }

//         //final copy
//         for(int i=0; i<arr.length; i++){
//             arr[i] = temp[i];
//         }
//     }

//     public static void print(int arr[]){
//         for(int element :arr){
//             System.out.print(element + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7};
//         int d = 2;
//         int n = arr.length;
//         rotation(arr, d, n);
//         print(arr);

//     }
// }


/**
 * practice
 */
// public class practice {

//     public static boolean checkDuplicate(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,1,4,5,6};
//         System.out.println(checkDuplicate(arr));
        
//     }
// }


//linear search(key) in  java ------------>>>>>>>>>>>>>.
/**
 * practice
 */
// public class practice {

//     public static int searchKey(int arr[], int key){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         int key = 44;
      

//        int index = searchKey(arr, key);
//        if(index == -1){
//         System.out.println("the index is not found");
//        }else{
//         System.out.println("key is at index : " + index);
//        }

    
      
//     }
// }



/**
 * find pairs in Array---------------------->>>>>>>>>>>>>>
 */
// public class practice {
//     public static void getPair(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             int curr = arr[i];
//             for(int j=i+1; j<arr.length; j++){
//                 System.out.print("(" + curr +"," + arr[j]  + ")");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {2,4,6,8,10};
//         getPair(arr);
    

        
//     }
// }



/**
 * practice
 */
// public class practice {
//     public static void getPairs(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             int curr = arr[i];
//             for(int j=i+1; j<arr.length; j++){
//                 System.out.print("(" + curr + "," + arr[j] + ")");
//             }
//             System.out.println();
//         }

//     }

//     public static void main(String[] args) {
//         int arr[] = {2,4,6,8,10};
//         getPairs(arr);
//     }
// }


/**
 * practice
 */
// public class practice {

//     public static boolean checkDuplicate(int arr[] ){
//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,3,4,5,2};
//         System.out.println(checkDuplicate(arr));

    
//     }
// }


/**
 * practice
 */
// public class practice {
//     public static int keySearch(int arr[] , int key){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         int key = 4;
//         int index = keySearch(arr, key);
//         if(index == -1){
//             System.out.println("Key not found");
//         }else{
//             System.out.println("Key is at Index : " + index);
//         }
//     }
// }


/**
 * practice
 */

 /**
  * practice
  */
//  public class practice {
//     public static int BuyAndSellStock(int prices []){

//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i = 0; i<prices.length; i++ ){

//             if(buyPrice<prices[i]){ //profit
//                int profit = prices[i]-buyPrice;
               
//                maxProfit = Math.max(maxProfit, profit);

//             }else{
//                 buyPrice = prices[i];
//             }

//         }
//         return maxProfit;
//     }


//     public static void main(String args[]){
        
//         int prices[] = {7, 1, 5, 3, 6, 4};



//         System.out.print(BuyAndSellStock(prices));

//     }
    
// }



/**
 * practice
 */
// public class practice {
//     public static int trappedWater(int height[]){
//         int n = height.length;
//         //calculate left max boundary - array
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i=1; i<n; i++{
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);

//         })

//     }

//     public static void main(String[] args) {
//         int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};


//     }
// }




/**
 * practice
 */
public class practice {

    public static int missingElement(int arr[], int n){
        int idealSum = n*(n+1)/2;
        int actualSum = 0;
        for(int element : arr){
            actualSum +=element;
        }
        return idealSum - actualSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int n = 5;
        int print = missingElement(arr, n);
        System.out.println(print);
    }
}