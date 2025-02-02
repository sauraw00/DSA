public class powerXby2 {
    public static int pow(int x ,int n){
        if (n==0) {
            return 1;
        }
        int xpnb2 = pow(x, n/2);
        int xn = xpnb2 * xpnb2;

        if (n%2==1) {
            xn = xn*x;
        }
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(pow(10, 8));
    }
}
