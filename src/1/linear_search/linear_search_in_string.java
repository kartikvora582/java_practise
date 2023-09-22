package linear_search;

public class linear_search_in_string {
    public static void main(String[] args) {
        String name = "kartik";
        char value = 'k';

        boolean ans = stringSearch(name, value);
        System.out.println(ans);
    }
    static boolean stringSearch(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int element = 0; element < str.length(); element++) {
            if(str.charAt(element) == target){
                return true;
            }
        }
        return false;
    }

}
