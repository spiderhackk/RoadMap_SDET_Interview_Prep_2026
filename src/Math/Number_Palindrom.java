package Math;

public class Number_Palindrom {
    public static void palindrome(int num){
        int rev =0;
        int original = num;
        while(num!=0){
            int rem = num%10;
            rev = rev*10+rem;
            num=num/10;
        }
        System.out.print(rev);
        if(rev==original){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not");
        }
    }

    public static void main(String[] args) {
        int number =121;
        palindrome(number);
    }

}
