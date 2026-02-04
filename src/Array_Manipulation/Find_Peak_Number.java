package Array_Manipulation;

public class Find_Peak_Number {

    public static int findPeak(int [] nums){
        int left =0, right = nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]<nums[mid+1]){
                left=mid+1;
            } else {
                right = mid;

            }
        }
        return left;
    }
    public static void main(String[] args) {
        int [] arr = {2,1};
        System.out.println(findPeak(arr));
    }

}



