package Arrays;

public class SecondLargestNum {
    static void main() {
        int[] arr={200,100,300,500};
        System.out.println(secLargest(arr));
    }
    static int secLargest(int[] arr){
        int firstLar=arr[0];
        int secLar=arr[arr.length-1];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>firstLar){
                secLar=firstLar;
                firstLar=arr[i];

            }
        }
        return secLar;
    }

}
