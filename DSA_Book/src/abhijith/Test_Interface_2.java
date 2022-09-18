public class Test_Interface_2 implements A,B{
    @Override
    public void show() {
        System.out.println("Hello");
    }

    @Override
    public void print() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Test_Interface_2 t1 = new Test_Interface_2();
        t1.show();
        t1.print();
        t1.msg();//interface can have non abstract methods
        A.mess();//static method
    }
}
