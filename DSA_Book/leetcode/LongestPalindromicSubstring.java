import java.util.ArrayList;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s){
        String temp="";
        String ret="";
        int j;
        int k;
        StringBuilder s1 = new StringBuilder(s);
                s1.reverse();
                s1.toString();
        System.out.println(s);
        System.out.println(s1);
        for (int i = 0; i < s.length(); i++) {
            j=i;
            k =s1.indexOf("s.charAt(j)");
            while (j<s.length()&&k<s.length()){
                if(s.charAt(j)!=s1.charAt(k)) {
                    //  j++;
                    k++;
                }
                else{
                    System.out.println(j+k);
                    j++;
                    k++;

                }
            }
        }

        return ret;
    }
}
