import java.util.*;

public class LC0142 {
    public ListNode detectCycle(ListNode head) {
        // Initialize
        HashSet<ListNode> visited = new HashSet<ListNode>();
        while (head != null) {
            if (visited.contains(head)) {
                return head;
            }
            visited.add(head);
            head = head.next;
        }
        return null;
    }


    public static void main (String[] args){
        LC0142 lc0142 = new LC0142();
        ListNode l0 = new ListNode(2);
        ListNode l1 = new ListNode(l0, new ListNode(0, new ListNode(-4, l0)));
        ListNode l2 = new ListNode(3, l1);
        ListNode cycleList = lc0142.detectCycle(l2);

        // print the value
        System.out.println(cycleList);
    }


}
