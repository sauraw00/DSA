package StringBuilder;

public class uprToLowerToUpr {
    public static String print(String s){
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
             char ch = sb.charAt(i);
            if (ch>= 'a' &&  ch<='z') {
               ch= (char)('A'+ ch -'a');
                sb.setCharAt(i, ch);
            }
            else if (ch>= 'A' && ch<='Z') {
               ch = (char)('a'+ch -'A');
                sb.setCharAt(i, ch);
            }
        }
        return sb.toString();
    }
  

    public static void main(String[] args) {
        String s = "SauRaw GuRjar";
        System.out.println(s);
      System.out.println(  print(s));
       
    }
}
