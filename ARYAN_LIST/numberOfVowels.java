package ARYAN_LIST;

public class numberOfVowels {
    public static void count(String s){
    int vowel = 0;
    int cosent = 0;

    String ref = "AaEeIiOoUu";
    for (int i = 0; i < s.length(); i++) {
       if ((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a') && s.charAt(i)<='z') {
        
        if (ref.indexOf(s.charAt(i)) !=-1) {
            vowel++;
        }else{

            cosent++;
        }
       }
    }
    System.out.println("number of vowel " + vowel );
    System.out.println(cosent);
    }

    public static void revArr(int arr[]){
        int start =0;
        int end = arr.length-1;
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        String s = "Hello World";
        count(s);

        int arr[] = {1,2,3,4,5,6,7};
        revArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
