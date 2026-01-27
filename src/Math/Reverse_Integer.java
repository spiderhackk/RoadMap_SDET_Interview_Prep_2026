package Math;

public class Reverse_Integer {

    public static void main(String[] args) {
        int num = 123;

        int rev = 0,rem;
        for (int i = 0; i < num; i++) {
            rem = (num/10);


            System.out.println(rem+" "+rev);

        }
    }
}
