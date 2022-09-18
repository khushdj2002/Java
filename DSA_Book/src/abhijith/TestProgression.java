package abhijith;

public class TestProgression {
    public static void main(String[] args) {
        Progression prog;
        System.out.print("AP with default increment  ");
        prog=new ArithmeticProgression();
        prog.printProgression(10);
        System.out.print("AP with increment  ");
        prog=new ArithmeticProgression(5);
        prog.printProgression(10);
        System.out.print("AP with mentioned starting point and increment   ");
        prog = new ArithmeticProgression(5,2);
        prog.printProgression(10);
        System.out.print("GP  with default base    ");
        prog=new GeometricProgression();
        prog.printProgression(10);
        System.out.print("Gp with basses     ");
        prog= new GeometricProgression(2,3);
        prog.printProgression(10);
        System.out.print("Fiboossi series   ");
        prog= new FibonacciProgression();
        prog.printProgression(10);
        System.out.print("Fib with bases    ");
        prog= new FibonacciProgression(4,5);
        prog.printProgression(10);
        System.out.println(prog.getClass().getSuperclass().getName());
    }
}
