package Math;

public class Print_100_Without_Loop {

    public static void printNumber(int start){

        if(start<=100){
            System.out.print(start+" ");
            printNumber(start+1);
        }
    }

    public static void main(String[] args) {
        printNumber(1);
    }
}
