package TwoPointer;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};

//        Set<Integer> set = new HashSet<>();
//        for(int num : nums){
//            set.add(num);
//        }
//        System.out.println(set);

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
