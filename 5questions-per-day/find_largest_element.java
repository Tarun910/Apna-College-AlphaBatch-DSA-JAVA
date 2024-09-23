
public class find_largest_element {

        public static int findLargest(int arr[]) {

        int max = arr[0];  
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println("the largest is : " + findLargest(arr));
    }
}


//Second Approach
//int max = Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;

