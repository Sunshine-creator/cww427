public class LinkedListTest {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverseList(ListNode head{
        if(head == null){
            return  null;
        }
        if(head.next ==null){
            return  head;
        }
        ListNode newHead =null;
        ListNode cur =head;
        ListNode pre =null;
        while (cur!=null){
            ListNode next = cur.next;
            if(next ==null){
                newHead = cur;
            }
            cur.next=pre;
            pre =cur;
            cur = next;
        }
        return  newHead;
    }
}
