public class maxOfAnArray {
    public static int maxSum(int arr[], int idx){
        if (idx== arr.length-1) {
            return arr[idx];
        }
         
           int misa = maxSum(arr, idx+1);
           if(misa  > arr[idx]){
                return misa ;
           }else{
            return arr[idx];
           }
    }
    public static void main(String[] args) {
        int arr[] = {222,33,2,22,3519};
        System.out.println(maxSum(arr ,0));
    }
}
