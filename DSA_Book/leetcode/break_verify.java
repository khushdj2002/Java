public class break_verify {
    public int breaking(int i){
        for (int j=1;j<10;j++){
            if(j%i==0)
                break;
            else
                System.out.println(j);
        }
        return 0;
    }
}
