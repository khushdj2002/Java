import java.lang.reflect.Array;
import java.util.Arrays;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        s1.toString();

        int a=0;
        char ch[] = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            ch[i]=s1.charAt(i);
        }
        System.out.println(Arrays.toString(ch));

        for (int i = 0; i < s1.length(); i++) {
            if(ch[i]==' '){
                continue;
            }

            if(ch[i]!=' '){
                a++;
                if(((i+1)==ch.length)||(ch[i+1]==' ')){
                    return a;
                }
            }
        }

        return a;
    }
}
