public class get_class {
    public static void main(String[] args) {
       // Object obj = new String("Hii");
        Object obj = new get_class();
        Class c = obj.getClass();
        System.out.println("Name of the class is  : "+c.getClass());
        System.out.println(obj);
        System.out.println(c);

    }
}
