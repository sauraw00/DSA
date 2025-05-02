public class s_2s_3s_sort {
    public static void sort(int arr[]){
     int cnt0 =0;
     int cnt1 =0;
     int cnt2 =0;
      
     for (int i = 0; i < arr.length; i++) {
        if (arr[i]==0) {
            cnt0++;
        }
        else if (arr[i]==1) {
            cnt1++;
        }
        else{
            cnt2++;
        }
     }
     for (int i = 0; i <cnt0; i++) {
        arr[i]=0;
     }
     for (int i = cnt0; i < cnt0+cnt1; i++) {
        arr[i]=1;
     }
     for (int i = cnt0+cnt1; i < arr.length; i++) {
        arr[i]=2;
     }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,2,1,1,2,0,2,1};
        System.out.println(arr);
        sort(arr);
          for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
          }
    }
}
