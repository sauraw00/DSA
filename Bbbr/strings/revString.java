
package Bbbr.strings;
public class revString {
    public static void rev(){
        StringBuilder sb = new StringBuilder("Saurabh");
     int start =0;
     int end = sb.length()-1;
     while(start<end){
         char temp = sb.charAt(start);
         sb.setCharAt(start, sb.charAt(end));
         sb.setCharAt(end, temp);
         start++;
         end--;
     }
     System.out.println(sb);
    }
    public static void main(String[] args) {
        // String s = "Saurabh";
        // // rev();
        // System.out.println(s.substring(1,4));
        // System.out.println(s.charAt(3));
        // for (int i = 0; i < s.length(); i++) {
        //     for (int j = i+1; j < s.length(); j++) {
        //         System.out.println(s.substring(i, j));
        //     }

            //split
            String s1=  "abc_def_ghi_jkl_mno";
            String [] parts = s1.split("_");
            for (int j = 0; j < parts.length; j++) {
                System.out.print(parts[j] +" ");
            }
          
        }
    }

