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
// public class practice {

//     public static void main(String[] args) {
//         String fruits[] = {"apple", "mango","banana"};
//         String largest = fruits[0];
//         for(int i=0; i<fruits.length; i++){
//             if(largest.compareTo(fruits[i])< 0){
//                 largest = fruits[i];

//             }
//         }
//         System.out.println(largest);
//     }
// }

/**
 * practice
 */
// public class practice {
//     public static boolean checkAnagram(String str1, String str2) {
//         if (str1 == null || str1 == null) {
//             return false;
//         }

//         if (str1.length() != str2.length()) {
//             return false;
//         }

//         char[] charArray1 = str1.toCharArray();
//         char[] charArray2 = str2.toCharArray();

//         // sort the arrays
//         Arrays.sort(charArray1);
//         Arrays.sort(charArray2);

//         return Arrays.equals(charArray1, charArray2);
//     }

//     public static void main(String[] args) {
//         String str1 = "listen";
//         String str2 = "silent";
//         checkAnagram(str1, str2);
//         if (checkAnagram(str1, str2)) {
//             System.out.println("these strings are anagram");
//         } else {
//             System.out.println("Not an Anagram");
//         }
//     }
// }

/**
 * practice
 */
// public class practice {
//     public static String reverse(String str) {
//         if (str == null) {
//             return null;
//         }
//         char[] charArray = str.toCharArray();
//         int left = 0;
//         int right = charArray.length - 1;
//         while (left < right) {
//             char temp = charArray[left];
//             charArray[left] = charArray[right];
//             charArray[right] = temp;
//             left++;
//             right--;
//         }
//         String newString = new String(charArray);
//         return newString;
//     }

//     public static void main(String[] args) {
//         String name = "Tarun";
//         System.out.println(reverse(name).toUpperCase());
//     }
// }

/**
 * practice
 */
// public class practice {
//     public static boolean checkPalindro(String str) {
//         for (int i = 0; i < str.length() / 2; i++) {
//             int n = str.length();
//             if (str.charAt(i) != str.charAt(n - 1 - i)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "racecar";
//         checkPalindro(str);
//         System.out.println(checkPalindro(str

//         ));

//     }
// }

/**
 * practice
 */

// public class practice {
//     public static int Find(ArrayList<Integer> list) {
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < list.size(); i++) {
//             if (list.get(i) >= max) {
//                 max = list.get(i);
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args) {

//         public static void swap(ArrayList<Integer> list, int idx1 , int idx2){
//             int temp = list.get(idx1);
//             list.set(idx1, list.get(idx2));
//             list.set(idx2, temp);

//         }
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);

//         int idx1 = 1;

//         int idx2 = 3;
//         System.out.println(list);
//         swap

// // System.out.println(list.size());
// // System.out.println(list);
// // int max = Find(list);
// // System.out.println(max);

// // reversing an arraylist
// // for (int i = list.size() - 1; i >= 0; i--) {
// // System.out.print(list.get(i) + " ");
// // }
// // System.out.println();

// // sorting an arraylist
// System.out.println(list);
// Collections.sort(list);
// System.out.println(list);
// Collections.sort(list, Collections.reverseOrder());
// System.out.println(list);
//     }

// }

/**
 * practice
 */

// public class practice {

//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>();

//         for (int i = 1; i <= 5; i++) {
//             list1.add(i * 1);
//             list2.add(i * 2);
//             list3.add(i * 3);

//         }

//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);

//         System.out.println(mainList);

//         for (int i = 0; i < mainList.size(); i++) {
//             ArrayList<Integer> currList = mainList.get(i);
//             for (int j = 0; j < currList.size(); j++) {
//                 System.out.print(currList.get(j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * practice
 */
// public class practice {
//     public static int storeWater(ArrayList<Integer> ht){
//         int maxWater = 0;
//         for(int i=0; i<ht.size(); i++){
//             for(int j=i+1; j<ht.size(); j++){
//                 int ht = Math.min(ht.get(i), ht.get(j));
//                 int wt = j-i;
//                 int currWater = ht*wt;
//                 maxWater = Math.max(maxWater, currWater);
//             }
//         }
//         return maxWater;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> ht = new ArrayList<>();
//         ht.add(1);
//         ht.add(8);
//         ht.add(6);
//         ht.add(2);
//         ht.add(5);
//         ht.add(4);
//         ht.add(8);
//         ht.add(3);
//         ht.add(7);

//     }
// }

// import java.util.ArrayList;

// public class practice {
//     public static int storeWater(ArrayList<Integer> heights) {
//         int maxWater = 0;
//         for (int i = 0; i < heights.size(); i++) {
//             for (int j = i + 1; j < heights.size(); j++) {
//                 int height = Math.min(heights.get(i), heights.get(j));
//                 int width = j - i;
//                 int currWater = height * width;
//                 maxWater = Math.max(maxWater, currWater);
//             }
//         }
//         return maxWater;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> ht = new ArrayList<>();
//         ht.add(1);
//         ht.add(8);
//         ht.add(6);
//         ht.add(2);
//         ht.add(5);
//         ht.add(4);
//         ht.add(8);
//         ht.add(3);
//         ht.add(7);

//         int result = storeWater(ht);
//         System.out.println("Maximum water that can be stored: " + result);
//     }
// }

/**
 * practice
 * 
 */
// public class practice {

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6 };
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }
//         System.out.println("The sum of the array is: " + sum);

//     }
// }

/**
 * practice
 */
// public class practice {

//     public static int arrSum(int arr[]) {
//         int sum = 0;
//         for (int element : arr) {
//             sum += element;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5 };
//         int result = arrSum(arr);
//         System.out.println(result);

//     }
// }

/**
 * practice
 */
// public class practice {
//     public static int arrSum(int arr[]) {
//         int sum = 0;
//         for (int element : arr) {
//             sum += element;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5 };
//         int sum = arrSum(arr);
//         System.out.println("The sum is : " + sum);
//     }
// }

//binrary search to find an element in array
/**
 * practice
 */
// public class practice {
//     public static int binarySearch(int arr[], int key) {
//         int start = 0;
//         int end = arr.length - 1;
//         int mid = (start + end) / 2;
//         while (start <= end) {
//             // comprasions
//             if (arr[mid] == key) {
//                 return key;
//             }

//             if (arr[mid] < key) {
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
//         int key = 5;
//         int index = binarySearch(arr, key);
//         System.out.println(index);
//     }
// }

/**
 * practice
 */

/**
 * practice
 */
// public class practice {
//     public static int binarySearch(int arr[], int key) {
//         int start = 0;
//         int end = arr.length - 1;
//         int mid = (start + end) / 2;

//         while (start <= end) {
//             // comparsions
//             if (arr[mid] == key) {
//                 return key;
//             }

//             if (arr[mid] < key) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5 };
//         int key = 5;

//         int index = binarySearch(arr, key);
//         System.out.println(index);
//     }
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
//   public class practice {

//     public static int BinarySearch(int arr[], int key){
//         int start = 0;
//         int end = arr.length-1;
//         while(start == end){
//             int mid = (start + end);
//             //comprasions
//             if(arr[mid] == key){
//                 return mid;
//             }
//             if(arr[mid] < key){
//                 start = mid +1;
//             }else{
//                 end = mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7,8};
//         int key = 5;
//         int index = BinarySearch(arr, key);
//         if(index == -1){
//             System.out.println("index not found");
//         }else{
//             System.out.println("key is at index:" + index);
//         }
//     }
//   }

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
//         int arr[] = {1,2,3,4,5,6,7};
//         System.out.println(checkDuplicate(arr));
//     }
// }

/**
 * practice
 */
// public class practice {
//     public static int countNum(int arr[] , int key){
//         int count = 0;
//         for(int i=0; i<arr.length; i++){
//             if(key == arr[i]){
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,2,4,3,4,5,6,7,7};
//         int key = 2;
//         countNum(arr, key);
//     }
// }

/**
 * practice
 */

/**
 * practice
 */
// public class practice {

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 4, 5, 9 };
//         int max = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println("the max element is : " + max);
//     }
// }

/**
 * practice
 */
// public class practice {
//     public static int findMax(int arr[]) {
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     public static int findMin(int arr[]) {
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         return min;
//     }

//     public static int findOccurence(int arr[], int key) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6, 7, 7, 7 };
//         int key = 7;
//         System.out.println("the max element is : " + findMax(arr));
//         System.out.println("the min element is : " + findMin(arr));
//         System.out.println("the occurence of 7 is :" + findOccurence(arr, key));
//     }
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
//  public class practice {

//  public static void main(String[] args) {
//     int arr [] = {1,2,3,4,5};
//     int sum = 0;
//     for(int i=0; i<arr.length; i++){
//         sum+=arr[i];
//     }
//     System.out.println(/);
//  }
//  }

/**
 * practice
 */
// import java.util.*;

// public class practice {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         while (true) {
//             System.out.println("enter the number");
//             int num;
//             num = sc.nextInt();
//             if (num % 2 == 0) {
//                 System.out.println("Even ");
//             } else {
//                 System.out.println("Odd");
//             }
//         }
//     }
// }

/**
 * practice
 */
// public class practice {

//     static int biggestOfThree(int x, int y, int z) {
//         if (x >= y && x >= z) {
//             return x;
//         } else if (y >= x && y >= z) {
//             return y;
//         } else
//             return z;
//     }

//     public static void main(String[] args) {
//         int a = 120;
//         int b = 23;
//         int c = 35;
//         int result = biggestOfThree(a, b, c);
//         System.out.println(result);
//     }
// }


/**
 * practice
 */
public class practice {

    
}