package String_Manipulation;

public class Reverse_String_without_inbuild_method {
    public static String reverse(String str){
        int left =0;
        int right =str.length()-1;
        char [] ch = str.toCharArray();
        while(left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "automation";

        System.out.println(reverse(str));
    }
}
