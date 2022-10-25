package CTDLGTBUOI9;

public class Q141 {
    public boolean hasCycle(ListNode head){
        if (head != null){
            return false;
        }
        ListNode slow = head;
        Listnode fast = head.next;

        while(slow != fast) {
            if(fast ==  null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
