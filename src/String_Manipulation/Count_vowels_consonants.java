package String_Manipulation;

import java.util.HashMap;
import java.util.Map;

public class Count_vowels_consonants {
    public static Map<String,Integer> countVowelsConsonants(String str){
        String vowels = "aeiouAEIOU";
        Map<String,Integer> count = new HashMap<>();
        int vowels_count =0;
        int consonants_count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(vowels.indexOf(str.charAt(i))==-1){
                consonants_count++;
                count.put("Consonants",consonants_count);

            }
            else {
                vowels_count++;
                count.put("vowels",vowels_count);

            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "automation";
        //{vowels=6, Consonants=4}

        System.out.println(countVowelsConsonants(str));
    }
}
