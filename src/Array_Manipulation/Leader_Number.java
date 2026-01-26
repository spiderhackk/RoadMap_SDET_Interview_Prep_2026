package Array_Manipulation;

import java.util.ArrayList;
import java.util.Collections;

public class Leader_Number {
    public static ArrayList<Integer> leaderNumber(int [] nums){
        ArrayList<Integer> list = new ArrayList<>();
        int maxRight = nums[nums.length-1];
        list.add(maxRight);
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>maxRight){
                maxRight=nums[i];
                list.add(maxRight);

            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int [] nums = {16, 17, 4, 3, 5, 2};
        System.out.println(leaderNumber(nums));

    }

}
