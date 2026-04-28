package Array_Manipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindDuplicateUsingStream {

    public static void main(String[] args) {
        int [] arr = {1,1,2,3,4,4};

        List<Integer> list =
                Arrays.stream(arr).boxed()

                        .distinct()
                        .toList();
        System.out.println(list);
    }

}
