package Array_Manipulation;

import java.util.*;

public class Missing_Number_from_Array {
    public static int missingNumber(int[] arr){
        int sum=0;
        int expectedSum=0;

        int n=arr.length;
        for (int i = 0; i < arr.length; i++) {
          sum+=arr[i];
        }
        expectedSum = n*(n+1)/2 ;
        return expectedSum-sum;
    }
    public static void main(String[] args) {
        //
        int [] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
}
