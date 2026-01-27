package String_Manipulation;

public class Reverse_Only_Letters {
    public static String reverseLetter(String str){
        int left =0,right=str.length()-1;
        char [] ch = str.toCharArray();
        while (left<=right){
            if(!Character.isLetter(ch[left])){
                left++;
            } else if (!Character.isLetter(ch[right])) {
                right--;

            }
            else{
                char temp= ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "1ab2";
        System.out.println(reverseLetter(str));
    }
}
