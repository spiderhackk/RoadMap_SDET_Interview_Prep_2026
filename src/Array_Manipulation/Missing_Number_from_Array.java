package Array_Manipulation;

import java.util.*;

public class Missing_Number_from_Array {
    public static int missingNumber(int[] arr){
        for (int i = 0; i <= arr.length; i++) {
            int finalI = i;
            boolean isMiss = Arrays.stream(arr).anyMatch(x->x== finalI);
            if (!isMiss){
                return finalI;
            }

        }
        return 0;
    }
    public static void main(String[] args) {
        //
        int [] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
}
