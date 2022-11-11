public class SortedAddLinkedList {
   private Node head;

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head=newNode;

    }

   public void insertsort(int data){
       Node newNode = new Node(data);
       Node current =this.head;
       while (current.getNextNode()!=null){
           if(data<=current.getNextNode().getData()){
               newNode.setNextNode(current.getNextNode());
               current.setNextNode(newNode);
           }
           current=current.getNextNode();
       }



   }
   public String toString(){
       String result="{";
       Node current = this.head;

       while (current!=null){
           result=result+current.toString()+", ";
           current=current.getNextNode();
       }
       result=result+"}";
       return result;
   }

    public static void main(String[] args) {
        SortedAddLinkedList slist = new SortedAddLinkedList();
        slist.insertAtHead(90);
        slist.insertAtHead(70);
        slist.insertAtHead(50);
        slist.insertAtHead(30);
        slist.insertAtHead(10);
       // slist.insertsort(80);
        System.out.println(slist.toString());
        System.out.println(slist.head.getData());
    }
}
