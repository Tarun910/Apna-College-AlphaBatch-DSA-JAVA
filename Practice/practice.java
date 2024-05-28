import java.util.*;

// public class practice {

//     public static int removeElement(int arr[] , int len){
//         //base condition
//         if(len == 0 || len == 1){
//             return len;
//         }

//         int j=0;
//         for(int i=0; i<len-1; i++){
//             if(arr[i] != arr[i+1]){
//                 arr[j++] = arr[i];
//             }
//         }
//         arr[j++] = arr[len-1];

//         return j;
//     }

//     public static void printUniqueElement(int arr[] , int uniqueElement, int k){
//         for(k=0; k<uniqueElement; k++){
//             System.out.println(arr[k]);
//         }

//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,2,3,4,4,5,6,6,7};
//         int len = arr.length;
//        int uniqueElement =  removeElement(arr, len);
//        System.out.println("The unique Elements are : " + uniqueElement);
        
//        printUniqueElement(arr, uniqueElement, uniqueElement);


//        for(int k=0; k<uniqueElement; k++){
//         System.out.println(arr[k]);
//        }
//     }
// }


/**
 * practice
 */
// public class practice {

//     public static int removeDuplicates(int arr[] , int len){
//         //base case
//         if(len == 0 || len == 1){
//             return len;
//         }
//         int temp[] = new int [len];
//         int j=0;
//         for(int i=0; i<len-1; i++){
//             if(arr[i] != arr[i+1]){
//                 temp[j++] = arr[i];
//             }
//         }

//         temp[j++] = arr[len-1];

//         //copy the elements from temp back into the main array
//         for(int i=0; i<j; i++){
//             arr[i]= temp[i];
//         }
//         return j;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,2,3,4,4,5,6,6,7};
//         int len = arr.length;
//         int uniqueElements = removeDuplicates(arr, len);
//         System.out.println("unique elements are : " + uniqueElements);
//         for(int k=0; k<uniqueElements; k++){
//             System.out.println(arr[k]);
//         }
//     }
// }



/**
 * practice
 */
// public class practice {
//     public static int checkDuplicates(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     return 1;
//                 }
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,1,2,5};
//         int result = checkDuplicates(arr);


//        if(result == -1){
//         System.out.println("No Duplicates");
//        }else{
//         System.out.println("Duplicate Found");
//        }

        
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
//     public static int BuyAndSellSTock(int prices[]){
        
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i=0; i<prices.length; i++){
//             if(buyPrice<prices[i]){
//                 int profit = prices[i] - buyPrice;
//                 maxProfit = Math.max(maxProfit, profit);

//             }else{
//                 buyPrice = prices[i];            }
//         }

//         return maxProfit;
//     }

//     public static void main(String[] args) {
//         int prices[] = {7,1,5,3,6,4};

//         System.out.println(BuyAndSellSTock(prices));
//     }
// }


/**
 * practice
 */
// public class practice {
//     public static int keySearch(int arr[], int key){
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
//         System.out.println(keySearch(arr, key));
//        int result =  keySearch(arr, key);
//        if(result == -1){
//         System.out.println("Index not found !");
//        }
//     }
// }



/**
 * practice
 */
// public class practice {
//     public static int binarySearch(int arr[] , int key){
//         int start = 0;
//         int end = arr.length -1;
//         while(start != end){
//             int mid = (start + end)/2;
//             if(arr[mid] == key){
//                 return mid;
//             }

//             if(arr[mid]<key){
//                 start = mid+1;
//             }
//             else{
//                 end = mid-1;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         int key = 4;
//     }
// }

/**
 * practice
 */
// public class practice {
//     public static int removeAll(int arr[] , int key){
       
//         int j=0;
        
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] != key){
//                 arr[j++] = arr[i];
//             }
//         }
//         return j;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,3,4,5,3,3,6,7,3};
//         int key = 3;
//         int count = removeAll(arr, key);
//         System.out.println(count);
       
//         for(int k=0; k<count; k++){
//             System.out.print(arr[k] + " ");
//         }
//         System.out.println();
        
//     }
// }

/**
 * practice
 */
// public class practice {

//     public static void main(String[] args) {
//     //    Scanner sc = new Scanner(System.in);
//     //    System.out.println("enter your name");
//     //    String name = sc.nextLine();
//     //    System.out.println("Your name is : " + name);


//     String name = "Tarun";
//     String cast = "Namdev";
//     System.out.println(name.length());
//     System.out.println(name.charAt(1));
//     System.out.println(name.toUpperCase());
//     System.out.println(name.concat(cast));
//     System.out.println(name + " " + cast);
//     for(int i=0; i<name.length(); i++){
//         System.out.println(name.charAt(i) + " " + "is at index : " + i + " ");
//     }
//     System.out.println();

    

//     }
// }


/**
 * practice
 */
// public class practice {
//     public static float getPath(String path){
//         int x = 0;
//         int y = 0;
      
//         for(int i=0; i<path.length(); i++){
//             char dir = path.charAt(i);
//             //North
//             if(dir == 'N'){
//                 y++;
//             }
//             else if(dir == 'S'){
//                 y--;
//             }
//             else if(dir == 'E'){
//                 x++;
//             }
//             else{
//                 x--;
//             }
//         }

//         int X2 = x*x;
//         int Y2 = y*y;

//         return (float)Math.sqrt(X2+Y2);
//     }

//     public static void main(String[] args) {
//         String path = "WNEENESENNN";
//         getPath(path);
//         System.out.println(getPath(path));
//     }
// }



/**
 * practice
 */
/**
 * practice
 */
// public class practice {
//     public static String subString(String str, int si, int ei){
//         String substr = "";
//         for(int i=si; i<ei; i++){
//             substr += str.charAt(i);
//         }
//         return substr;
//     }

//     public static void main(String[] args) {
//         String name = "HelloWorld";
//         System.out.println(subString(name, 0, 5));
//         System.out.println(str.substring(0,5 ));
//     }
// }






/**
 * practice
 */
/**
 * practice
 */
public class practice {

    public static void main(String[] args) {
        String fruits[] = {"apple", "mango","banana"};
        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])< 0){
                largest = fruits[i];

            }
        }
        System.out.println(largest);
    }
}