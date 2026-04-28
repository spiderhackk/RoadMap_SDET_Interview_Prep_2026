package String_Manipulation;

public class Permutations {
    public static void permute(String str,String ans){

        if(str.isEmpty()){
            System.out.println(ans);
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0,i)+str.substring(i+1);
//            System.out.println("remaining is "+" "+rem);
            permute(rem,ans+ch);
        }
    }

    public static void main(String[] args) {
        String str ="ABC";
        permute(str,"");
    }
}
