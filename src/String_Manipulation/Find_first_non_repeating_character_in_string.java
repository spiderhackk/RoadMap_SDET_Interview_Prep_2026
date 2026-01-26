package String_Manipulation;

public class Find_first_non_repeating_character_in_string {
    public static Integer non_repeating_character(String str){
        int non_repeat_char_index =0;
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                non_repeat_char_index= str.indexOf(str.charAt(i));
                break;
            }
        }
        return non_repeat_char_index;
    }
    public static void main(String[] args) {
        String str = "automation";
        System.out.println(non_repeating_character(str));
    }
}
