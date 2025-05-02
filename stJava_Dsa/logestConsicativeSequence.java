import java.util.Arrays;



public class logestConsicativeSequence {
     public static int lcs(int arr[]){
        if(arr.length ==0){
            return 0;
        }
        Arrays.sort(arr);
        int cnt =0;
        int longest =1;
        int n = arr.length;
        int lastSmaller = Integer.MIN_VALUE;
      for (int i = 0; i < n; i++) {
        if (arr[i]-1 == lastSmaller) {
            cnt+=1;
            lastSmaller = arr[i];
        }else if (lastSmaller!= arr[i]) {
            cnt =1;
            lastSmaller = arr[i];
        }
        longest = Math.max(longest, cnt);
      }
     
      return longest;

     }
    public static void main(String[] args) {
        
        int arr[] ={102,4,1, 103,106,100,3,2,104,105,5,100,100,101,106};
        System.out.println(lcs(arr));

    }
}
