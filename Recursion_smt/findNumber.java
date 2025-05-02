public class findNumber {
    public static int findNum(int arr[],int idx ){
        int taget =5;
        if (idx >= arr.length) {
        return -1;
      }
      
      if (arr[idx] == taget) {
        return idx;
      }
    return findNum(arr, idx+1);
   
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,8,2,4,9,8,7};
        int ans =findNum(arr, 0);
        System.out.println(ans);
    }
}
