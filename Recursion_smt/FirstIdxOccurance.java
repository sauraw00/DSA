public class FirstIdxOccurance {
    public static int Fio(int arr[] , int idx, int x){
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx]==x) {
            return idx;
        }else{
            int fiisa = Fio(arr, idx + 1, x);
            return fiisa;
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {1,9,5,4,3 ,6,5,4};
        System.out.println(Fio(arr, 0, 3));
     }
}
