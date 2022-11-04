import java.util.Arrays;

class CommonPrefix{
    public boolean isAnagram(String s, String t) {
        char a1[] = new char[s.length()];
        char a2[] = new char[t.length()];
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(a1.toString());
        if(a1.equals(a2)){
            return true;
        }
        else{
            return false;
        }
    }
}