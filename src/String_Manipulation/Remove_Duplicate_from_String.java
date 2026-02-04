package String_Manipulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Remove_Duplicate_from_String {
    public static String removeDuplicate(String str){
        StringBuilder newString = new StringBuilder();
        int count =0;
        Set<Character> set = new HashSet<>();
        for (char c: str.toCharArray()) {
            if(!set.contains(c)){
                set.add(c);
                newString.append(c);
            }



        }
        return newString.toString();
    }
    public static void main(String[] args) {
        String str = "HappyNewYear";
        //output - HapyNewYr;
        System.out.println(removeDuplicate(str));
    }
}
