package String_Manipulation;

public class Replace_Vowels_with_X {
    public static String replaceString(String str, char ch){
        String vowels = "aeiouAEIOU";
        char [] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(vowels.indexOf(charArray[i])!=-1){

                charArray[i] = ch;
            }

        }
        return new String(charArray);
    }
    public static void main(String[] args) {
        String str = "my name is shilajit";
        char ch ='x';
        System.out.println(replaceString(str,ch));
    }
}
