
public class largestString {
    public static String findLargest(String str[]){
        String largest = str[0];
        for(int i=0; i<str.length; i++){
            if(largest.compareTo(str[i]) < 0){
                largest = str[i];
            }
        }

        return largest;
    }
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        String largest = findLargest(fruits);
        System.out.println(largest);

    }
    
}

 