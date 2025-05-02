package ARYAN_LIST;

import StringBuilder.sbOperations;

public class occuranceOfChar {
    public static String occurance(String chars){
        StringBuilder sb = new StringBuilder("");
        int cnt =1;

       for (int i = 1; i < chars.length()-1; i++) {
    
            if (chars.charAt(i) ==chars.charAt(i-1)) {
                cnt++;
            }else{
                cnt =0;
                cnt++;
            }
                sb.append(chars.charAt(i)+cnt);
               
            
       }
       return sb.toString();
    }
    public static void main(String[] args) {
        String chars = "aaabbbbbbbcccccc";
        System.out.println(occurance(chars));
        }
}
