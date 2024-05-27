public class Count_number_of_Occurrences {

    public static int countOccurrneces(int arr[] , int key){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(key == arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,2,2,2};
        int key = 2;
        System.out.println(countOccurrneces(arr, key));
    }
    
}
