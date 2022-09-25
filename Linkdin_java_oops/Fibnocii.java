public class Fibnocii {
    
    int n1=0,n2=1,n3;
    int sum=1;
    public int Fib(int n){
        
        if(n==1)
            return n1;

        for (int i = 0; i < n-1; i++) {
            n3=n1+n2;
            sum+=n3;
            n1=n2;
            n2=n3;
        }
        return sum;
    }
}
