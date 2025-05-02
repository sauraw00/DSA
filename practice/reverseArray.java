public class reverseArray {
    public static void rev(int arr[]){
        int n = arr.length-1;
           int i =0;
           int j =n;
        while(i<j) {
             int temp = arr[i];
             arr[i] =arr[j];
             arr[j] = temp;
             i++;
             j--;
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
        rev(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
