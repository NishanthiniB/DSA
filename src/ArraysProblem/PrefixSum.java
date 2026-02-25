package ArraysProblem;

import java.util.Arrays;

public class PrefixSum {
    static void main() {
        int[] nums = {1,2,3,4};
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] runningSum(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0]=arr[0];
        for(int i=1; i<prefixSum.length; i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        return prefixSum;
    }
}
