package String_Manipulation;

public class Extract_numbers_from_string_and_sum_of_that {

    public static void main(String[] args) {
        String str = "1abc2W30yz67";
        int sum =0;
        int num=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                num = num*10 +(str.charAt(i)-'0');

            }
            else{
                sum+=num;
                num =0;
            }
        }

        sum+=num;
        System.out.println(sum);
    }
}
