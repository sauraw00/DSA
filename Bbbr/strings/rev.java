package Bbbr.strings;

public class rev {
    public static void rev(String s){
       char[] charArray = s.toCharArray();
       int start = 0;
       int end = s.length() - 1;
       while (start < end) {
           char temp = charArray[start];
           charArray[start] = charArray[end];
           charArray[end] = temp;
           start++;
           end--;
       }
       s = new String(charArray);
    }
    public static void main(String[] args) {
        
    }
}
