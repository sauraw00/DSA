package StringBuilder;

public class sbOperations {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("helli");
        sb.setCharAt(0, 'd');
        sb.insert(4, 'o');
        sb.deleteCharAt(0);
        sb.append(" ji");
        System.out.println(sb);
    }
}
