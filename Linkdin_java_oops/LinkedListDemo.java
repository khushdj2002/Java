public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(50);
        list.insertAtHead(500);
        list.insertAtHead(25);
        System.out.println(list);

        System.out.println("LEngth of the linked list is "+list.length());
        list.DeleteFromHead();
        System.out.println(list);

        System.out.println(list.Search(10));
    }
}
