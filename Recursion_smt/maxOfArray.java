public class maxOfArray {
    public static void print(int arr[] , int idx){
        int n = arr.length-1;
            
      if (idx == n) {
        return;
      }
  
      print(arr, idx+1);
      


 
    
    }
    public static void main(String[] args) {
     int arr[] = {4,3,6,4,3,1};
     print(arr, 0);
        
    }
}
