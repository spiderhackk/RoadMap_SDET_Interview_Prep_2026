package Array_Manipulation;

import java.util.*;

public class Two_Sum {

    public  static  int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
//        nums = [], target = 9;
//        [3,3], target = 6
        int [] arr = {3,3};
        int target = 6;
        int [] res = twoSum(arr,target);
        System.out.println(res[0]+","+res[1]);


        }




}
