
class leetcode {
    public static void main(String[] args) {
        System.out.println("test");
    } 
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode tmpNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmpNode;
        }
        return prev;
    }
}
