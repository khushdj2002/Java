public class Test_Abstraction extends Academician {
    @Override
    void teach() {
        System.out.println("This is teach method");
    }

    public static void main(String[] args) {
        Academician ac = new Test_Abstraction();
        ac.teach();
        ac.dispaly();
        organ();
        System.out.println(ac.name);
    }
}
 abstract class Academician{
    int no;
    String name;
    Academician(){
        no=50000;
        name="Kushal";
    }
    abstract void teach();

     void dispaly(){
        System.out.println("Hi i am Academician");
    }
    static void organ(){
        System.out.println("I am static method");
    }
}
