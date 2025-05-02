import Recursion.incDecNums;

public class allIndexes {

    public static int[] indexes(int arr[] , int x , int idx  , int fsf){
        if (idx == arr.length-1) {
            return new int[fsf];
        }

        if (arr[idx] ==x) {
            int [] iarr = indexes(arr, x, idx+1,fsf+1);
            iarr[fsf] = idx;
          
            return iarr;
        }else{
            int [] iarr = indexes(arr, x, idx+1, fsf);
            return iarr;
        }

    }

    public static void main(String[] args) {
        int arr[] = {2,3,6,9,8,3,2,3,6,4};
      int idxx[]=  indexes(arr, 3, 0, 0);

        for (int i = 0; i < idxx.length; i++) {
            System.out.println(idxx[i]);
        }
       

    }
}