package Array_Manipulation;

import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate {
    public static boolean containsDuplicate(int []arr){
        int i =0;
        boolean duplicate = false;
        Map<Integer,Integer> map = new HashMap<>();
        for (int x : arr){
            if(!map.containsKey(x)){
                map.put(x,i);
                i++;
            }
            else{
                return duplicate=true;
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(containsDuplicate(arr));


    }

}
