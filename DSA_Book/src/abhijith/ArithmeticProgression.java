package abhijith;

public class ArithmeticProgression  extends Progression{
    protected long increment;

    public ArithmeticProgression(){
        this(1,0);
    }

    public ArithmeticProgression(long stick){

        this(stick,0);
    }
    public ArithmeticProgression(long increment,long start){
        super(start);
        this.increment=increment;
    }
    protected void advance(){
       // current=current+increment;
    }
}
