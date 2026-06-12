package String_Manipulation;

import java.util.HashMap;
import java.util.Map;

public class Reverse_String_By_Pattern {

    public static void main(String[] args) {
        String input = "Mr Shilajit Goswami";

        // 1. Create the exact character-to-character substitution map
        String outputPattern = "Im Awsogtij Alihsrm";

        Map<Character,Character> map = new HashMap<>();
        for( int i=0;i<input.length();i++){
            map.put(input.charAt(i),outputPattern.charAt(i));
        }

        StringBuilder str = new StringBuilder();
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            str.append(map.getOrDefault(ch,ch));
        }
        System.out.print(map);
        System.out.print(str.toString());


    }
}
