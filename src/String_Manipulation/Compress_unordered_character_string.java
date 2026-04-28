package String_Manipulation;
import java.util.*;
public class Compress_unordered_character_string {

    public static void main(String[] args) {
        String str = "aabbdccccddbe";
        StringBuffer result = new StringBuffer();
        char [] ch = str.toCharArray();
        Arrays.sort(ch);
        int count=1;
        for (int i = 1; i < str.length(); i++) {
            if(ch[i]==ch[i-1]){
                count++;
            }
            else{
                result.append(ch[i-1]).append(count);
                count=1;
            }
        }
        result.append(str.charAt(str.length()-1)).append(count);
        System.out.println(result);
    }
}
