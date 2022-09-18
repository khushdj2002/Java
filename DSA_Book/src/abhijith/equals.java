public class equals {
    public static void main(String[] args) {
        Object obj1=new equals();
        Object obj2 = new equals();
        Object obj3 = obj1;

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));
    }
}
