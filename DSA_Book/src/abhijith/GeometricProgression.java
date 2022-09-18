package abhijith;

import abhijith.Progression;

public class GeometricProgression extends Progression {
    protected long base;
    public GeometricProgression(){
        this(2,1);
    }
  public GeometricProgression(long base,long start){
        super();
        this.base=base;
  }
    protected void advance(){
        current*=base;
    }
}
