package abhijith;

import abhijith.Progression;

public class FibonacciProgression extends Progression {
    protected long prev;

    public FibonacciProgression(){
        this(0,1);
    }
    public FibonacciProgression(long prev,long start){
        super(start);
        this.prev=prev;
    }
    protected void advance(){
        long temp=prev;
        prev=current;
        current+=temp;
    }
}
