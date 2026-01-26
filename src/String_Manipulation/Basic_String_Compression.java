package String_Manipulation;

public class Basic_String_Compression {
    public static void main(String[] args) {
        String str = "abbcccddddaaa";
        //output = a1b2c3d4a3;
        String output = "";
        int wordCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (output.indexOf(str.charAt(i))==-1){
                System.out.println(str.charAt(i));
            }
        }

    }
}
