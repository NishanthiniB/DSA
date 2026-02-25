package ArraysProblem;

import java.util.Arrays;

public class RotateArrayByOne {
    static void main() {
        int[] num={1,2,3,4,5};
        rotateOne(num);
        System.out.println(Arrays.toString(num));
    }
    static void rotateOne(int[] arr){
        int n = arr.length;
        if (n <= 1) return; // nothing to do

        int last = arr[n - 1];
        // shift right by one
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }
}
