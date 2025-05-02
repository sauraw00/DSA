package Bbbr.strings;

public class palindromeSubstrings {
    public static boolean isPalindrome(String s){
        int i=0;
        int j= s.length()-1;
        
       while (i<=j) {
        char a =s.charAt(i);
        char b = s.charAt(j);
        if (a!=b) {
            return false;
        }
            i++;
            j--;
        
      
       }
       return true;
         
            
        
    }
    public static void main(String[] args) {
        String s1 = "abccbc";

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i+1; j < s1.length(); j++) {
                String ss = s1.substring(i,j);
                if (isPalindrome(ss)==true) {
                    System.out.println(ss);
                }
            }
        }
    }
}
