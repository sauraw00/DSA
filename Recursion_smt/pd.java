class pd{
    public static void printdecrease(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        printdecrease(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
       
        System.out.println("before fun;");
        printdecrease(5);
        System.out.println("after fun");
    }
}