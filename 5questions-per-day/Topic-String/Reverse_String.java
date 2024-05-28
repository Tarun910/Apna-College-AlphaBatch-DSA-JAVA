public class Reverse_String {
    public static String reverse(String str){
        if(str == null){
            return null;
        }
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length-1;
        while(left <right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }


        //return new String(charArray);: After the loop completes and all characters are swapped, convert the character array back to a String and return it.  

        String newString = new String(charArray);
        return newString;


    /*
     return new String(charArray);
     */

    }
    public static void main(String[] args) {
        String name = "Tarun";
        System.out.println(reverse(name));
    }
}
