package String_Manipulation;

import java.util.Arrays;

public class Anagrams {
    public static boolean anagrams(String str_one, String str_two){
        char [] ch1 = str_one.toCharArray();
        char [] ch2 = str_two.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);

    }

    public static void main(String[] args) {
        String str_one = "listen";
        String str_two = "silent";
        System.out.println(anagrams(str_one,str_two));
    }
}
