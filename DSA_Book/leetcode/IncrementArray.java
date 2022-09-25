public class IncrementArray {
    public int[] plusOne(int[] digits) {
        for (int j = digits.length-1; j >=0 ; j--) {
                if(digits[j]<9){
                    digits[j]=digits[j]+1;
                    return digits;
                }
                digits[j] = 0;
        }
        int [] arr = new int[digits.length+1];
        arr[0]=1;
        for (int i = 1; i <arr.length ; i++) {
            arr[i]=digits[i-1];
        }
        return arr;
    }
}
