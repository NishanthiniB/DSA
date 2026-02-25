public class PivotIndex {
    static void main() {
        int[] arr ={1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }

    static int pivotIndex(int[] arr){
        int totalSum=0;
        for(int num: arr){
            totalSum+=num;
        }
        int leftSum=0;
        for(int i=0; i<arr.length; i++){
            int rightSum=totalSum-leftSum-arr[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
}
