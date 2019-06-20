

class leetcode{
    public static void main(String[] args) {
    }
    public static ListNode middleNode(ListNode head) {
        if(head == null)
            return null;
        int count = 0;
        ListNode pt = head;
        while(pt != null){
            count++;
            pt = pt.next;
        }
        if(count > 1){
            count = (count / 2) + 1;
        }
        int i = 1;
        pt = head;
        while(pt != null){
            if(i == count){
                break;
            }            
            i++;
            pt = pt.next;
        }
        return pt;
    }
}