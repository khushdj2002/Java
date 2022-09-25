import java.io.IOException;

public class main_Abstract {
    public static void main(String[] args) throws IOException {
        DigitsOnlyFileReader d1 = new DigitsOnlyFileReader("message.txt");
        System.out.println(d1.readFile());
        System.out.println(d1.getPath());
    }
}
