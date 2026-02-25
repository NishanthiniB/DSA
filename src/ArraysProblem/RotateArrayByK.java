package ArraysProblem;

import java.util.Arrays;

public class RotateArrayByK {
    static void main() {
        int[] array = {1,2,3,4,5,6,7};
        rotate(array,3);
        System.out.println(Arrays.toString(array));
    }

    static void rotate(int[] nums, int k){

        int n = nums.length;
        if (n == 0) return;
        k = k % n;
        if (k == 0) return; //

        reverse(nums, 0, nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums, k, nums.length-1);
    }

    static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++; end--;
        }
    }
}
