package String_Manipulation;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {


    public static void main(String[] args) {
        String s ="abccdedef";
        int left =0,maxCount=0,starWindow=0;
        HashSet<Character> set= new HashSet<>(); //abc
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;

            }
            set.add(s.charAt(i));

            System.out.println(starWindow);
            maxCount = Math.max(maxCount,i-left+1);
        }
        System.out.println(maxCount);
        System.out.println(s.substring(starWindow,starWindow+maxCount));
    }
}
