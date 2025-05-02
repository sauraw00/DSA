package ARYAN_LIST;

public class secondLargest {
    public static int secondLrgst(int arr[]){
        int n = arr.length-1;
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest< arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            }else if(largest>arr[i] && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[] ={5,6,3,8,4,2,9,6,2,554,6,3};
       System.out.println( secondLrgst(arr));
        
    }
}
 