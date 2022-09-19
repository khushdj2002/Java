import java.util.Arrays;

public class Solution3 {
    public int lengthofLongestString(String s){
        char arr[] = new char[s.length()];
        int arr1[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i]=s.charAt(i);
        }
        for (int i = 0; i <s.length()-1 ; i++) {
            int sum=1;
            for (int j = i+1; j <s.length()-1; j++) {

            }
            arr1[i]=sum;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"  ");
        }
        Arrays.sort(arr1);

    return arr1[s.length()-1];
    }
}
