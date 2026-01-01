package TwoPointer;

public class TwoSum {
//1 based index return
    public static void main() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

    }

    static int[] twoSum(int[] num, int target){
        int left=0;
        int right=num.length-1;
        while(left<right){
            int sum=num[left]+num[right];

            if(sum==target){
                return new int[]{left+1, right+1};
            }

            if(sum<target){
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
