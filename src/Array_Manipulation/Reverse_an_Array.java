package Array_Manipulation;

import java.util.Arrays;

public class Reverse_an_Array {
    public static int [] reverseArray(int[] nums){
        int left = 0, right=nums.length-1;
        while (left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverseArray(nums)));
    }
}
