public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers atn = new AddTwoNumbers();

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum1=1;
        int sum2=1;
        for (int i = 0; i < 3; i++) {
            sum1=sum1*l1.val;
            sum2=sum2*l2.val;
            l1=l1.next;
            l2=l2.next;
        }
        System.out.println(sum1+sum2);

        int x = sum1+sum2;

        ListNode li =new ListNode();
        for (int i = x; i >0 ; i=i/10) {
            li.val=i%10;
            li=li.next;
        }

        return li;
    }
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
