public class HashCode {
    static int last_roll=100;
    int roll_no;

    HashCode(){
        roll_no=last_roll;
        ++last_roll;
        System.out.println(roll_no);
        System.out.println(last_roll);
    }

    @Override
    public int hashCode() {
        return roll_no;
    }

    public static void main(String[] args) {
        HashCode h = new HashCode();
        System.out.println(h);
        System.out.println(h.toString());
    }
}
