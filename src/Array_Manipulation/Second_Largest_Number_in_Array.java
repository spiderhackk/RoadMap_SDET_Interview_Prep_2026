package Array_Manipulation;

import java.util.Arrays;

public class Second_Largest_Number_in_Array {
    public static int secondLargest(int [] arr){
        int largest_number = arr[0];
        int second_largest = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if (largest_number<arr[i]) {
                second_largest = largest_number;
                largest_number = arr[i];

            }
            else if (arr[i]>second_largest && largest_number!=arr[i]){
                second_largest = arr[i];
            }
        }

        return second_largest;
    }
    public static void main(String[] args) {
        int [] arr  = {2,5,3,7,9,10,30};
        System.out.println(secondLargest(arr));


    }
}
