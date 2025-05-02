package ARYAN_LIST;

import String.palindrome;

public class strPalindrom {
    public static boolean palindrome(String str){
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if ( str.charAt(i)!=str.charAt(n-1-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "aabaa";
        System.out.println(palindrome(str));
    }
}