package Array_Manipulation;

import java.util.Arrays;

public class Moves_Zeros_to_End {
    public static int [] movesZeros(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count<arr.length){
            arr[count]=0;
            count++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,0,3,0,5,8,0,7,0,6};
        System.out.print(Arrays.toString(movesZeros(arr)));
    }
}
