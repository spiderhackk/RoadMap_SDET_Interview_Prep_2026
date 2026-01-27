package String_Manipulation;

import java.util.HashSet;
import java.util.Set;

public class Check_Sentence_is_Pangram {
    public static boolean pangram(String str){
        char [] ch = str.toCharArray();
        boolean pangram = false;
        Set<Character> set  = new HashSet<>();
        for (char c:ch){
            if(Character.isLetter(c)){
                set.add(c);
            }
        }
        if (set.size()==26){
            pangram=true;
        }
        return pangram;
    }
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(pangram(str));

    }
}
