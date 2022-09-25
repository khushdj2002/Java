public class main_ModArrayList {
    public static void main(String[] args) {
        ModArrayList li = new ModArrayList();
        li.add(0);
        li.add(10);
        li.add(120);
        li.add(130);

        System.out.println(li.size());
        System.out.println();
        System.out.println(li.getUsingMod(1));
        System.out.println(li.getUsingMod(-2));
        System.out.println(li.getUsingMod(40));
        System.out.println(li.getUsingMod(5));

    }
}
