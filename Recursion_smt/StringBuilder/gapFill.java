package StringBuilder;

public class gapFill {
    public static String addNumbsInString(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            int gap = curr-prev;

            sb.append(gap);
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "abdgca";
        System.out.println(addNumbsInString(s));
    }
    
}
