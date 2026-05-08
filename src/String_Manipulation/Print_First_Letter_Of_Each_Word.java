package String_Manipulation;

public class Print_First_Letter_Of_Each_Word {

    public static void main(String[] args) {
        String str ="Google is good company";
        String [] ch= str.split(" ");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i].charAt(0));
        }
    }
}
