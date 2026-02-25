package ArraysProblem;

import java.util.Arrays;

public class LargestAndSmallest {
    static void main() {
    int[] arr = {15,444,300,12,1};
    int[] result = findLarSmall(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] findLarSmall(int[] arr){
        int max=arr[0];
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] ans = new int[2];
        ans[0]=min;
        ans[1]=max;
        return ans;
    }
}
