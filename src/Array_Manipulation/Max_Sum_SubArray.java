package Array_Manipulation;

public class Max_Sum_SubArray {

    public static void main(String[] args) {
        int [] arr = {-2,4,5,-1,-5,8};
        int currentSum =arr[0];
        int maxSum=arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i],currentSum+arr[i]);
            maxSum = Math.max(maxSum,currentSum);
        }

        System.out.println(maxSum);
    }
}
