public class printArray {
    public static void print(int arr[] , int idx){
        int n = arr.length-1;
            
      if (idx < 0) {
        return;
      }
      System.out.println(arr[idx]);
      print(arr, idx-1);
     
 
    
    }
    public static void main(String[] args) {
     int arr[] = {4,3,6,4,3,1};
     print(arr, arr.length-1);
        
    }
}
