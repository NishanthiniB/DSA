package ArraysProblem;

import java.util.Arrays;

public class Sorted {
    static void main() {
        int[] arr ={1,5,3,2};
        int[] result = sortArray(arr);
        System.out.println((Arrays.toString(result)));
    }
    public static int[] sortArray(int[] nums) {

        int temp=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }
        }
        return nums;
    }
}
