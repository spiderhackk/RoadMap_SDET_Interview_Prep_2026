package String_Manipulation;

import java.util.*;

public class Count_Frequency_of_Characters_in_String {
    public static Map<Character,Integer> checkFrequency(String name){
        Map<Character,Integer> map = new HashMap<>();
        int charCount =1;
        char [] ch = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);


        }
        return map;
    }
    public static void main(String[] args) {
        String name = "madam";
        System.out.println(checkFrequency(name));
        int length = checkFrequency(name).size();
        System.out.println(length);
    }
}
