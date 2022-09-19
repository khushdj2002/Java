public class Main {
    public static void main(String[] args) {
        Tree t1 = new Tree(25,5,Treetype.OAK);
        Tree t2 = new Tree(120,50,Treetype.PEARL);

               t1.announceTallTree();
               t2.announceTallTree();
        System.out.println(Tree.Trunk_color);
    }
}
