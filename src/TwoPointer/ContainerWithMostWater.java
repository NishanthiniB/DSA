package TwoPointer;

public class ContainerWithMostWater {

    static void main() {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxHeight(height));
    }

    static int maxHeight(int[] nums){
        int left=0; int right=nums.length-1; int max=0;
        while(left<right){
            int width= right-left;
            int height=Math.min(nums[left], nums[right]);
            int area = width*height;
            max=Math.max(max,area);
            if(nums[left]<nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
