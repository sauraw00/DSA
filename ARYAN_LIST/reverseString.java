package ARYAN_LIST;

public class reverseString {
    public static String revString(String str){
        StringBuilder sb = new StringBuilder(str);
         int i =0;
         int j = sb.length()-1;
         while (i<j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length()-1));
            sb.setCharAt(j, temp);
            i++;
            j--;
         }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
       
      
       System.out.println(revString(str));

    }
}
