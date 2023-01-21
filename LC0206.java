public class LC0206 {

    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;
        while (currNode!= null){
            // Save next node before changing the pointer
            ListNode nextNode = currNode.next;
            // Change the pointer
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;

    }


    public static void main (String[] args){
        LC0206 lc0206 = new LC0206();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4,  new ListNode(5))));
        ListNode reverseNodes = lc0206.reverseList(l1);

        // print values
        while (reverseNodes != null){
            System.out.println(reverseNodes.val);
            reverseNodes = reverseNodes.next;
        }
    }


}
