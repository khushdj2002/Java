public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.insertAtHead(5);
        dlist.insertAtHead(50);
        dlist.insertAtHead(25);
        dlist.insertAtHead(55);
        System.out.println(dlist.toString());
    }
}
