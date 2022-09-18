public interface A {
    void print();
    default void msg(){
        System.out.println("Default method");
    }
    static void mess(){
        System.out.println("Staic method");
    }
}
