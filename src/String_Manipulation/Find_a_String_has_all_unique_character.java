package String_Manipulation;

public class Find_a_String_has_all_unique_character {

    public static boolean isStringUnique(String str){
        boolean isStringUniqueStatus = false;
        String uniqueCheck = "";
        for (int i = 0; i < str.length(); i++) {
            if (uniqueCheck.indexOf(str.charAt(i)) ==-1) {
                uniqueCheck += str.charAt(i);
                isStringUniqueStatus = true;
            }
            else{
                isStringUniqueStatus = false;
                break;

            }

        }

        return isStringUniqueStatus;
    }
    public static void main(String[] args) {
        String str = "automation";
        System.out.println(isStringUnique(str));
    }
}
