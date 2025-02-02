import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicates {
  public static void rDupli(int arr[]){
    ArrayList al = new ArrayList<>();
   
    Arrays.sort(arr);
    for (int i = 1; i < arr.length; i++) {
        if(arr[i-1]==arr[i]){
        continue;

    }else{
        al.add(arr[i]);
    }

}
System.out.println(al);
  }
    public static void main(String[] args) {
        int arr[] = {8,6,4,8,6,2,5,8,2,5,8};
        rDupli(arr);

    }
}
