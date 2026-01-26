package Array_Manipulation;

public class Longest_Prefix {
    public static String longestPrefix(String[]str){
        String prefix = str[0];
        for (int i = 1; i <str.length-1; i++) {
            while (!str[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
            }
            if (prefix.isEmpty()){
                return "";
            }
        }
        return prefix;

    }

    public static void main(String[] args) {
        String [] str = {"fly","flight","flow"};
        System.out.println(longestPrefix(str));
    }
}
