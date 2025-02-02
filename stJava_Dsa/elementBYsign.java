public class elementBYsign {
    public static void signArrangement(int arr[]){
        int ans[] = new int[arr.length];
        int posIdx = 0;
        int negIdx = 1;
        for (int i = 0; i < ans.length; i++) {

            if(arr[i]<0){
                ans[negIdx] = arr[i];
                negIdx+=2;

            }else{
                ans[posIdx] = arr[i];
                posIdx+=2;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+"   ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,-6,-2,1,3,-22};
        signArrangement(arr);

    }
}
