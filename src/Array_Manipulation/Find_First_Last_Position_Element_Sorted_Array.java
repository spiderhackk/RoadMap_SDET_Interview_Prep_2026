package Array_Manipulation;

import java.util.Arrays;

public class Find_First_Last_Position_Element_Sorted_Array {

    public static int firsIndex(int [] nums,int target){

        int left =0, right = nums.length-1;
        int count = -1;
        while(left<=right) {
            int mid = left + (right-left) / 2;
            if (nums[mid] == target) {
                count=mid;
                right=mid-1;


            } else if (target>nums[mid]) {
                left=mid+1;

            } else if (target<nums[mid]) {
                right = mid-1;

            }
        }
        return count;
    }
    public static int secondIndex(int [] nums,int target){

        int left =0, right = nums.length-1;
        int count = -1;
        while(left<=right) {
            int mid = left + (right-left) / 2;
            if (nums[mid] == target) {
                count=mid;
                left=mid+1;


            } else if (target>nums[mid]) {
                left=mid+1;

            } else if (target<nums[mid]) {
                right = mid-1;

            }
        }
        return count;
    }
    public static int [] firstLastPositionElement(int []nums,int target){
        int [] output = new int[2];
        output[0]=firsIndex(nums,target);
        output[1]=secondIndex(nums,target);



        return output;
    }
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        int target = 8;
//        Output: [3,4]
        System.out.println(Arrays.toString(firstLastPositionElement(arr, target)));
    }
}
