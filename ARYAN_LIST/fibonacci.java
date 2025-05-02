package ARYAN_LIST;

public class fibonacci {
    public static int fib(int n){
        if (n<=1) {
            return n;
        }
           return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n =10;
      fib(n);
      for (int i = 0; i <n; i++) {
         System.out.println(fib(i));
      }
    }
}
