package abhijith;

public class Duplicate extends Hello {
    public static void main(String[] args) {
        Duplicate dp = new Duplicate();
        Hello hi= new Duplicate();
        Hello hii= new Hello();

        dp.hello();
        hi.hello();
        hii.hello();
    }
    void hello(){
        System.out.println("Hii");
    }
}
class Hello{
    void  hello(){
        System.out.println("Hello world");
    }
}