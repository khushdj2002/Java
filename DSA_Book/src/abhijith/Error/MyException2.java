package abhijith.Error;

public class MyException2 {
    public static void main(String[] args) {
        int [] num = {1,2,3};
        try {
            System.out.println(num[11]);
        }

        catch (Exception e){
            System.out.println("Error found");
            System.out.println("the error was "+e);
        }
        finally {
            System.out.println("Finally was also executed");
        }
    }
}
