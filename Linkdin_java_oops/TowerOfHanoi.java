public class TowerOfHanoi {
    public int move(int numberofDiscs,char from,char to,char inter){
        if(numberofDiscs==0){
            return 1;
        }
        move(numberofDiscs-1,from,inter,to);
        System.out.println("Moving disc "+numberofDiscs+" from "+from+" to "+to);
        return move(numberofDiscs-1,inter,to,from);

    }

    public static void main(String[] args) {
        TowerOfHanoi th = new TowerOfHanoi();
        th.move(3,'A','C','B');
    }
}
