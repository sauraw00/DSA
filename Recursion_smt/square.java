public class square {
    public static int sq(int x , int n){
        if(n==0){
            return 1;
        }
         int xm1 = sq(x, n-1);
         int  ans = x * xm1;
         return ans;
         

    }
    public static void main(String[] args) {
        System.out.println(sq(2,3));
    }
}
