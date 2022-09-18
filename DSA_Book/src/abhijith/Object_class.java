public class Object_class {
    public static void main(String[] args) {
        int x=100;
        int y=200;
        int z=x+y;
        System.out.println("Sum is "+z);
        Object obj = new Object_class();
        System.out.println(obj.getClass());
        System.out.println(obj.toString());
    }
}
