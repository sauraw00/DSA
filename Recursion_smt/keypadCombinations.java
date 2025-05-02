import java.util.ArrayList;
import java.util.Scanner;

public class keypadCombinations {

    public static String[] codes = {":," ,"abc" , "def" ,"ghi" ,"jkl" ,"mno" ,"pqrs" ,"tu" ,"vwx" ,"yz"};

    public static ArrayList<String> getKeyCombination(String str){
        if (str.length() ==0) {
          ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres =getKeyCombination(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codeforCh = codes[ch-'0'];
        for (int i = 0; i < codeforCh.length(); i++) {
            char chcode = codeforCh.charAt(i);

            for (String rstr : rres) {
                mres.add(chcode + rstr);
            }
        }
       return mres;
    }
        
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str =  scn.next();
        ArrayList<String> words = getKeyCombination(str);
        System.out.println(words);


    }

}
