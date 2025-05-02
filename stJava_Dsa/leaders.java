import java.util.ArrayList;
import java.util.Collections;

public class leaders {
    public static ArrayList<Integer> leader(int[] arr){
        ArrayList<Integer> al = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i = n-1; i>= 0; i--){
            if (arr[i] > maxi) {
               
                al.add(arr[i]);
            }
            maxi = Math.max(maxi, arr[i]);
        }
     Collections.reverse(al);
     return al;
      
     
    }
        public static void main(String[] args) {
        int arr[] = {10,22,12,3,0,6};

        ArrayList <Integer> al =leader(arr);
        
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        }

    }

