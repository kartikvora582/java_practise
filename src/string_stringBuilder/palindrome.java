package string_stringBuilder;

public class palindrome {
    public static void main(String[] args) {
        String palin = "dabcfscbad";
        System.out.println(palinChecker(palin));
    }
    static boolean palinChecker(String input){
        int start = 0;
        int end = input.length() - 1;
        while (start < end){
            if (input.charAt(start) == input.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }



}
