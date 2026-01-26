package String_Manipulation;

import java.util.stream.Stream;

public class Remove_all_duplicate_from_string {
    public static String removeDuplicate(String str){
        char [] ch  = str.toCharArray();
        String duplicateString = "";
        for (int i = 0; i < str.length(); i++) {
            if(duplicateString.indexOf(ch[i])==-1){
                duplicateString+=ch[i];

            }

        }
        return duplicateString;
    }
    public static void main(String[] args) {
        String str = "automation";
        System.out.println(removeDuplicate(str));
    }
}
