public class subString {
    public static String subString(String str, int si, int ei){
        String substr ="";
        for(int i=si; i<ei; i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String name = "HelloWorld";
        System.out.println(subString(name, 0, 5));
        System.out.println(name.substring(0, 5));

    }
}
