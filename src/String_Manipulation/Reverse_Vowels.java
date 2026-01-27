package String_Manipulation;

public class Reverse_Vowels {
    public static String reverseVowels(String str){
        String vowels = "aeiouAEIOU";
        int left =0, right =str.length()-1;
        char [] ch = str.toCharArray();
        while (left<=right){
            if(vowels.indexOf(ch[left])==-1 && vowels.indexOf(ch[right])==-1){
                left++;
                right--;

            }
            else if (vowels.indexOf(ch[right])==-1) {
                right--;

            }
            else if (vowels.indexOf(ch[left])==-1) {
                left++;
            }
            else{
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
                }



        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverseVowels(str));
    }
}
