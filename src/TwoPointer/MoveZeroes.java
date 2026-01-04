package TwoPointer;

import java.util.Arrays;

//fast & slow pointer approach
public class MoveZeroes {

    static void main() {
        int[] nums={0,1,0,3,12};
        moveZero(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void moveZero(int[] nums){
        int slow=0;
        for(int fast=0; fast<nums.length; fast++){
            if(nums[fast]!=0){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        while(slow<nums.length){
            nums[slow]=0;
            slow++;
        }
    }
}
