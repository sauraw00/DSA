public class arraySortedOrNot {

    public static boolean arrays(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]<= arr[i]) {
                
            }else{

                return false;
            }
            
        }
        return true;
    }

    
    public static void main(String[] args) {
        int arr[] = {1,2,7};

      System.out.println(arrays(arr));
    }
}
