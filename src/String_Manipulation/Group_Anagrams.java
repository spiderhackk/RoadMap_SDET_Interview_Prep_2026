package String_Manipulation;

import java.util.*;

public class Group_Anagrams {

    public static void main(String[] args) {
        String [] str ={"eat","tea","tan","ate","nat","bat"};
        Map<String, List<String>> map = new HashMap<>();

        for (String word:str){
            char [] ch = word.toCharArray();

            Arrays.sort(ch);
            String st = new String(ch);

            map.putIfAbsent(st,new ArrayList<>());
            map.get(st).add(word);
        }
        for(List<String> list : map.values()){
            if(list.size()>1){
                System.out.println(list);

            }
        }
    }

}
