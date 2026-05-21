package Array_Manipulation;

public class Find_Peak_Number {

    public static int findPeak(int [] nums){
        int idnex =0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1]){
                idnex=  i;
            }

        }
        return idnex;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,5,6,4};
        System.out.println(findPeak(arr));
    }

}



