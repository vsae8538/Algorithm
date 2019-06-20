
class leetcode {
    public static void main(String[] args) {
        
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;
        ListNode pt = l1;
        ListNode pt2 = l2;
        int add = 0;
        int isOne = 0;
        int len = 0;
        int len2 = 0;
        while(pt != null || pt2 != null){
            if(pt != null){
                len++;
                pt = pt.next;
            }
            if(pt2 != null){
                len2++;
                pt2 = pt2.next;
            }
        }
        if(len >= len2){
            pt = l1;
            pt2 = l2;
            isOne = 1;
        }else{
            pt = l2;
            pt2 = l1;
        }
        int n = 0;
        int status = 1;
        while(pt != null){
            if(status == 1){
                n = pt.val + pt2.val + add;
            }else{
                n = pt.val + add;
            }
            if(n >= 10){
                pt.val = n % 10;
                add = n / 10;
            }else{
                pt.val = n;
                add = 0;
            }
            if(pt2.next == null){
                status = 0;
            }
            if(pt2.next != null){
                pt2 = pt2.next;
            }
            pt = pt.next;
        }
   
        if(isOne == 1){
            if(add != 0){
                pt = l1;
                while(pt.next != null)
                    pt = pt.next;
                pt.next = new ListNode(add);
            }
            return l1;
        }else{
            if(add != 0){
                pt = l2;
                while(pt.next != null)
                    pt = pt.next;
                pt.next = new ListNode(add);
            }
            return l2;
        }
    }
}
