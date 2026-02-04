package Array_Manipulation;

import java.util.HashSet;
import java.util.*;

public class Fine_Index_of_Element_in_Array {
    public static int findFirst(int [] nums, int elem){
        int left =0, right = nums.length-1;
        int index = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(elem==nums[mid]){
                index = mid;
                right = mid-1;

            } else if (elem>nums[mid]) {
                left = mid+1;

            }
            else{
                right = mid-1;
            }
        }
        return index;
    }

    public static int findlast(int [] nums, int elem){
        int left =0, right = nums.length-1,index=-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(elem==nums[mid]){
                index = mid;
                left = mid+1;
            } else if (elem>nums[mid]) {
                left=mid+1;

            }
            else {
                right = mid-1;
            }
        }
        return index;
    }

    public static int findElementIndex(int [] nums, int elem){

        int numberOfOcc = findFirst(nums,elem)+(findlast(nums,elem)-findFirst(nums,elem));
            return numberOfOcc;
    }
    public static void main(String[] args) {
        int [] nums = {1,3,3,3,4,5,6,6};
        int ele = 3;
        System.out.println(findElementIndex(nums,ele));
    }
}
