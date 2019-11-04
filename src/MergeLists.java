public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        ListNode front = a;
        if(a == null) return b;
        if(b == null) return a;
        while(a != null && b != null){
            ListNode temp = a.next;
            ListNode tempB = b.next;
            a.next = b;
            b.next = temp;
            a = temp;
            b = tempB;
        }
        return front;
    }
}
/*
Notes:
This isn't a null pointer exception, because you're not performing any OPERATIONS on null. You're just pointing to it (lines 7 & 8)
ask yourself what OPERATIONS you're performing on a and b and a.next and b.next.
if you're not performing any operations on a.next or b.next, there's no risk of a null pointer exception here.
 */