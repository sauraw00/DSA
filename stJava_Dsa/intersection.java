import java.util.ArrayList;
import java.util.Arrays;

public class intersection {
    public static void inSection(int arr[], int arr2[]){
    
    ArrayList<Integer> al = new ArrayList<>();

     int i =0;
     int j =0;
        while (i<arr.length && j< arr2.length) {
            if (arr[i]<arr2[j]) {
                i++;
            }
            else if (arr[i]> arr2[j]) {
                j++;
            }
            else{
            al.add(arr[i]);
            i++;
            j++;
            }
        }
         
        
     
     for (int j2 = 0; j2 < al.size(); j2++) {
        System.out.println(al.get(j2));
     }
    }
 public static void main(String[] args) {
    int arr[] ={1,2,3,4,8,7};
    int arr2[] = {2,3,8,9,};

    inSection(arr, arr2);
 }   
}
