
public class SortedListRemoval {
    public ListNode uniqify(ListNode list){
        if(list == null) return null;
        ListNode front = list;
        while(list.next != null){
            if(list.info == list.next.info){
                list.next = list.next.next;
            }
            else{
                list = list.next;
            }
        }
        return front;
    }
}
/*
Note: this code would fail with any nonconsecutive repreating values; [1,2,3,1], for example.
But we're assuming that list is already sorted, so that's not an issue.
 */