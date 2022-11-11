public class LinkedList {
    private Node head;

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head=newNode;

    }





    public void DeleteFromHead(){
        this.head=this.head.getNextNode();
    }

    public Node Search(int search){
        Node current = this.head;

        while (current!=null){
            if(search==current.getData()){
                return current;
            }
            current=current.getNextNode();
        }
        return null;
    }

    public int length(){
        int length=0;
        Node current = this.head;

        while (current!=null){
            length++;
            current=current.getNextNode();
        }
        return length;
    }

    public String toString(){
        String result="{";
        Node current = this.head;

        while (current!=null){
            result+= current.toString()+",";
            current=current.getNextNode();

        }
        result+="}";
        return result;
    }
}
