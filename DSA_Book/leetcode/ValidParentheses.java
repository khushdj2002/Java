public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']'||s.charAt(s.length()-1)=='('||s.charAt(s.length()-1)=='{'||s.charAt(s.length()-1)=='['){
            return false;
        }
        int j;
        for (int i = 0; i < s.length(); i=i+2) {
            j=i;
            if(s.charAt(j)=='('&&s.charAt(j+1)==')'){

            } else if (s.charAt(j)=='['&&s.charAt(j+1)==']') {

            } else if (s.charAt(j)=='{'&&s.charAt(j+1)=='}') {

            }
            else {
                return false;
            }
        }


        return true;
    }
}
