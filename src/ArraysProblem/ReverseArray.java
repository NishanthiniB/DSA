package ArraysProblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    static void main() {
    int[] arr={5,4,3,2,1};
    for(int i=arr.length-1; i>=0; i--){
        System.out.print(arr[i]);
    }

    //Inbuilt Function
    Integer[] array= {15,14,13,12,11};
    List<Integer> reverse=Arrays.asList(array);
        Collections.reverse(reverse);
        System.out.println(reverse);
    }

}
