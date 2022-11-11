public class Fibnocii_recuyrsion {

    public int factorial(int data){
        if(data==0){
            return 1;
        }

        return data*factorial(data-1);
    }

    public static void main(String[] args) {
        Fibnocii_recuyrsion fr = new Fibnocii_recuyrsion();

        System.out.println(fr.factorial(4));
    }
}
