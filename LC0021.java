class LC0021 {
    // // Recursion
    // public ListNode mergeTwoLists(ListNode list1, ListNode list2) { 
    //     // If one of them is null, return the other
    //     if (list1 == null){return list2;}
    //     else if (list2 == null){return list1;}
    //     // Else, assign head to the smaller node
    //     ListNode head;
    //     if (list1.val < list2.val){
    //         head = list1;   // NOT list1.val! head should have value and pointer
    //         // update
    //         list1 = list1.next;
    //     }
    //     else{
    //         head = list2;
    //         list2 = list2.next;
    //     }
    //     head.next = mergeTwoLists(list1, list2);
    //     return head;
    // }


    // Iteration
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) { 
        // Initialize
        ListNode head = new ListNode(0);
        ListNode tail = head;
        // Iterate
        while ((list1!=null) && (list2!=null)){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
            }
            // Move the tail pointer to the end
            tail = tail.next;
        }
        // If one of the lists becomes null, attach the other one(non-null)
        tail.next = list1 == null? list2:list1;
        // remember first node of head is 0
        return head.next;
    }




    public static void main (String[] args){
        LC0021 lc0021 = new LC0021();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode myNodes = lc0021.mergeTwoLists(l1, l2);

        // print values
        while (myNodes != null){
            System.out.println(myNodes.val);
            myNodes = myNodes.next;
        }
    }
}