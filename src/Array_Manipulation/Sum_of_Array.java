package Array_Manipulation;

public class Sum_of_Array {

    public static int sumArray(int [] nums){
        int left = 0, right = nums.length-1;
        int sum = 0;
        while (left<=right){
            sum = sum+nums[left]+nums[right];
            left++;
            right--;

        }
        return sum;
    }
    public static void main(String[] args) {
        int [] nums = {1,24,33,44};
        System.out.println(sumArray(nums));
    }
}
