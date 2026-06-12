package String_Manipulation;


public class Basic_String_Compression {

    public static StringBuilder compresString(String str){
        //output = a1b2c3d4a3;
        StringBuilder result = new StringBuilder();
        int count =1;
       for(int i =1;i<str.length();i++){
           if(str.charAt(i)==str.charAt(i-1)){
               count++;
           }
           else{
               result.append(str.charAt(i-1)).append(count);
               count=1;
           }
       }
       result.append(str.charAt(str.length()-1)).append(count);
        return result;
    }
    public static void main(String[] args) {
        String str = "abbcccddddaaa";

        System.out.println(compresString(str));
    }
}
