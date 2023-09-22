package RecursionSeries;

import java.util.ArrayList;
import java.util.Arrays;

public class stringSubestSubsequence {
    public static void main(String[] args) {
        String para = "kartikeya";
        String sub = "ABCD";
        System.out.println(subseqRet("",sub));
//        System.out.println(skip_a_return(para));
    }
    // first let us do some string question

//    Q1. remove 'a' from a string
    static void skip_a(String word, String toBeFilled){
        if(word.isEmpty()){
            System.out.println(toBeFilled);
            return;
        }
        char firstElement = word.charAt(0);
        if (firstElement == 'a'){
            skip_a(word.substring(1), toBeFilled);
        }
        if(firstElement != 'a'){
            skip_a(word.substring(1), toBeFilled + firstElement);
        }
    }

    // Q1.1 here in the above question we did not return the string now how do we return with returntype as string
    static String skip_a_return(String word){
        if(word.isEmpty()){
            return "";
        }
        char firstElement = word.charAt(0);
        if (firstElement == 'a'){
            return skip_a_return(word.substring(1));
        }
        else {
            return firstElement + skip_a_return(word.substring(1));
        }

    }

    // Q2 to skip a word lets say "mango" from the string

    static String skip_word(String word){
        if(word.isEmpty()){
            return "";
        }
        if(word.startsWith("mango")){
            return skip_word(word.substring(5));
        }else {
            return skip_word(word.substring(1));
        }
    }

    static ArrayList<String> subseqRet(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}

