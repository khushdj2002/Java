public class Anonymous_class_2 {
    public static void main(String[] args) {
        Age1 abs = new Age1() {
            @Override
            public void getNum() {
                System.out.println("Noum is "+no);
            }
        };
        abs.getNum();
    }
}
abstract class Age1{
    int no =30;
    abstract public void getNum();
}

