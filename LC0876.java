public class LC0876 {
    public ListNode middleNode(ListNode head) {
        // Copy current list
        ListNode middleHead = head;
        // Get the length
        int leng = 0;
        while (head != null){
            head = head.next;
            leng++;
        }
        // Get the middle
        int middle = leng/2+1;
        for(int i=1; i<middle; i++){
            middleHead = middleHead.next;
        }
        return middleHead;
    }


    public static void main (String[] args){
        LC0876 lc0876 = new LC0876();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4,  new ListNode(5))));
        ListNode middleList = lc0876.middleNode(l1);

        // print values
        while (middleList != null){
            System.out.println(middleList.val);
            middleList = middleList.next;
        }
    }


}
