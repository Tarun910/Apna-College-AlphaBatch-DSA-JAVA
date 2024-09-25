public class Bubble_Sort {
    public static void BubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // function to print sorted array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        BubbleSort(arr);
        printArr(arr);
    }
}
