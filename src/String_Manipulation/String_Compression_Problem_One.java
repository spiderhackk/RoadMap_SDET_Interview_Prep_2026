package String_Manipulation;

public class String_Compression_Problem_One {
    public static String compressString(String str){
//        String character = "";
//        String numberChar = "";
//        char [] ch = str.toCharArray();
//        for (int i = 0; i < str.length(); i++) {
//            if(Character.isLetter(ch[i])){
//                character+=ch[i];
//            }
//            else{
//                numberChar+=ch[i];
//            }
//
//        }
//        return character+numberChar;
//    OPTIMIZE SOLUTION USING STRING BUILDER
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                letters.append(str.charAt(i));
            }
            else{
                digits.append(str.charAt(i));
            }

        }
        return letters.append(digits).toString();
    }
    public static void main(String[] args) {
        String string = "a1b2c3";
        System.out.println(compressString(string));
    }
}
