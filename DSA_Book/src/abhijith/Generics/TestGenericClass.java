package abhijith.Generics;

public class TestGenericClass {
    public static void main(String[] args) {
        SimpleGenericClass<Double> exam1 = new SimpleGenericClass<>();
        SimpleGenericClass<String> exam2 = new SimpleGenericClass<>();

        SimpleGenericClass<A> exam3 = new SimpleGenericClass<>();

        exam1.setValue(10.0);
        exam2.setValue("Hello");
        exam3.setValue(new A(5,3));

        System.out.println(exam1.getValue());
        System.out.println(exam2.getValue());
        System.out.println(exam3.getValue());
    }
}
