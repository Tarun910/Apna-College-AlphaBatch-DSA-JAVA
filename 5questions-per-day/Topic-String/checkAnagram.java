import java.util.Arrays;

//method one when String is given in the Array form of character----->>>>>>>>>>>>...

// public class checkAnagram {

//     public static boolean checkAnagram(char str1[] , char str2[]){
//         int n1 = str1.length;
//         int n2 = str2.length;

//         if(n1 != n2){
//             return false;
//         }

//         Arrays.sort(str1);
//         Arrays.sort(str2);

//         for(int i=0; i<n1; i++){
//             if(str1[i] != str2[i]){
//                 return false;
//             }
//         }

//         return true;
//     }
//     public static void main(String[] args) {
//         char str1[] = {'t', 'e', 's', 't'};
//         char str2[] = {'t', 't', 'e' ,'w'};
//         System.out.println(checkAnagram(str1, str2));

//         if(checkAnagram(str1, str2)){
//             System.out.println("The two given strrings are anagram  of each other");
//         }else{
//             System.out.println("not anagram");
//         }
//     }
// }




//------------->>>>>>>>>>>>>>>>.

/**
 * checkAnagram
 */
public class checkAnagram {

    public static boolean checkAnagram(String str1,String str2 ){

        if(str1 == null || str2 == null){
            return false;
        }

        if(str1.length() != str2.length()){
            return false;
        }

        //converting string to char arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        //sort the arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1 , charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        checkAnagram(str1, str2);

        if(checkAnagram(str1, str2)){
            System.out.println(str1 + " and " + str2 + " are anagrams!");
        }else{
            System.out.println(str1 + " and " + str2 + " are not anagrams!");
        }
    }
}