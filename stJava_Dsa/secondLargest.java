public class secondLargest {

    public static int sLargest(int arr[]){
      int largest = arr[0] ;
      int sLargestt = Integer.MIN_VALUE;
      for (int i = 1; i < arr.length; i++) {
         if(largest<arr[i]){
            sLargestt = largest;
            largest = arr[i];


         }
         else if(largest> arr[i]&& arr[i]>sLargestt){
            sLargestt = arr[i];
         }
      }
      return sLargestt;
    }

    public static int sSmallest(int arr[]){
        int smallest = arr[0];
        int sSmallestt = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<smallest){
                sSmallestt = smallest;
                smallest =arr[i];
            }
            else if(arr[i]>smallest && arr[i]<sSmallestt){
                  sSmallestt = arr[i];
            }
            
        }
        return sSmallestt;
    }
    public static void main(String[] args) {
        int arr[]={2,8,6,5,8,9};
        System.out.println(sSmallest(arr));
        System.out.println(sLargest(arr));
    }
}