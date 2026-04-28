package String_Manipulation;

public class Reverse_Alternative_Vowels_from_String {
    public static void main(String[] args) {
        String str = "automation";

        StringBuffer stringBuffer = new StringBuffer();
        int count =1;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            if(vowels.indexOf(str.charAt(i))!=-1){
                if (vowels.indexOf(str.charAt(i))!=-1  && count%2!=0){
                    stringBuffer.append(str.charAt(i));
                }
                count++;
            }
            else{
                stringBuffer.append(str.charAt(i));
            }

        }
        System.out.println(stringBuffer);
    }
}
