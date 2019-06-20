
class leetcode{
    public static void main(String[] args) {
        
    }
    public void deleteNode(ListNode node) {
        ListNode tmp = node.next;
        node.val = tmp.val;
        node.next = tmp.next;
    }

}