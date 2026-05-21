package Array_Manipulation;

import java.util.Arrays;

public class Rotate_Array {
    public static int [] returnRotate(int[] num, int d){
        int n = num.length;
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = (i+d)%n;
            arr[i] = num[a];
        }
        return arr;

    }

    public static void main(String[] args) {
        int [] num ={1,2,3,4,5};
        int d=4;
        int [] result = returnRotate(num,d);
        System.out.println(Arrays.toString(result));
    }


}
