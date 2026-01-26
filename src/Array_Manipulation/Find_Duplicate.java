package Array_Manipulation;

import java.util.HashSet;

public class Find_Duplicate {
    public static int findDuplicate(int [] nums){
        int x =-1;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            if(set.contains(num)){
                x=num;
            }
            else {
                set.add(num);
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
       System.out.println(findDuplicate(nums));

    }
}
