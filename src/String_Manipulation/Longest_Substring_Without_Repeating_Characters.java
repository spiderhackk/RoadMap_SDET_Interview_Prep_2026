package String_Manipulation;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {


    public static void main(String[] args) {
        String str ="abcabcbb";
        int left =0,right=0,maxCount=0,starWindow=0;
        HashSet<Character> set= new HashSet<>(); //abc
        while(right<str.length()){
            if(!set.contains(str.charAt(right))){
                set.add(str.charAt(right));
                maxCount = Math.max(maxCount,right-left+1);
                if(right-left+1>maxCount){
                    maxCount = right-left+1;
                    starWindow=left;

                }
                right++;
            }

            else{
                set.remove(str.charAt(left));
                left++;
            }
        }
        System.out.println(maxCount);
        System.out.println(str.substring(starWindow,starWindow+maxCount));
    }
}
