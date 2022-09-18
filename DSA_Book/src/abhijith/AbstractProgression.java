public abstract class AbstractProgression {
    protected long current;
    public AbstractProgression(){
        this(0);
    }
    public AbstractProgression(long current){
        this.current=current;
    }
    public long nextValue(){
        long answer = current;
        advance();
        return answer;
    }
    protected abstract void advance();

    public void printProgression(int n){
        System.out.println(nextValue());
        for (int j = 1; j < n; j++) {
            System.out.println("  "+nextValue());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AbstractProgression ab = new AbstractProgression() {
            @Override
            protected void advance() {

            }
        };
    }
}
