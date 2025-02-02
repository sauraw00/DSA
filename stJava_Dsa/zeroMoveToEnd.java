

import java.util.ArrayList;



public class zeroMoveToEnd {
    public static void moveZeros(int arr[]){
    ArrayList<Integer> al = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            al.add(arr[i]);
        }
    }
    int nz = al.size();
    for (int i = 0; i < nz; i++) {
        arr[i] = al.get(i);
    }
   
   
        
    for (int i = nz; i < arr.length; i++) {
        
            arr[i] = 0;
        }
    
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
     }
    }

    
    public static void main(String[] args) {
        int arr[] = {2,5,0,2,0,4,1,0,6}; 
        moveZeros(arr);
    }
}
