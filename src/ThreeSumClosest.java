import java.util.Arrays;

public class ThreeSumClosest {

    static void main() {
        int[] nums = {-1,2,1,-4};
        int target = 2;
        System.out.println(threeSumClosest(nums, target));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;

        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    left++;

                } else {
                    right--;
                }
            }
        }
        return closest;
    }


}
