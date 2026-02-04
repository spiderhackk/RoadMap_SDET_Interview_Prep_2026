package Array_Manipulation;

public class Second_Smallest_Second_Largest {
    public static int[] secondSmallestAndLargest(int [] nums){
        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;
        int smallestElement = Integer.MAX_VALUE;
        int secondSmallestElement = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>largestElement){
                secondLargestElement = largestElement;
                largestElement = nums[i];
            } else if (nums[i]>secondLargestElement && nums[i]!=largestElement) {
                secondLargestElement = nums[i];

            }
            if (nums[i]<smallestElement) {
                secondSmallestElement = smallestElement;
                smallestElement=nums[i];

            } else if (nums[i]<secondSmallestElement && nums[i]!=smallestElement) {
                    secondSmallestElement = nums[i];
            }


        }


    return new int[]{secondSmallestElement,secondLargestElement};
    }
    public static void main(String[] args) {
        int [] nums = {2,5,3,7,9,10,30};
        int [] arr = secondSmallestAndLargest(nums);
        System.out.println("Second Smallest_number "+arr[0]+" second largest number "+arr[1]);
    }
}
