public class linearSearch_key {
    public static int keySearch(int arr[] , int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 4;
        int index = keySearch(arr, key);
        if(index == -1){
            System.out.println("index not found");
        }else{
            System.out.println("The key is at index : " + index);
        }

    }
}
