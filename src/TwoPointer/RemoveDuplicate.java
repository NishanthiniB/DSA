package TwoPointer;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int result = remove(nums);
        for(int i=0; i<result; i++){
            System.out.print(nums[i]+" ");
        }

    }

    static int remove(int[] nums){
        int slow=0;
        for(int fast=1; fast<nums.length; fast++){
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow+1;
    }
}
