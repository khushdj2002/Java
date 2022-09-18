package abhijith.Error;

public class catch_spec {
    public static void main(String[] args) {
        try {
            int a[]=new int[5];
            a[5]=30/0;
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ARRAY got");
        }
        catch (Exception e){
            System.out.println("Exception  got");
        }
    }
}
