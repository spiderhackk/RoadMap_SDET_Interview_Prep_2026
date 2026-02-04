package Array_Manipulation;
import java.util.*;
import java.util.stream.Collectors;

public class Remove_duplicate_elements_from_ArrayList {

    public static List<Integer> removeDuplicate(int []arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);

        }
        List<Integer> items = list.stream().distinct().toList();
        return items;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        System.out.println(removeDuplicate(arr));



    }
}
