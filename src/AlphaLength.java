import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AlphaLength {
    public ListNode create (String[] words) {
        Arrays.sort(words);
        Set<String> extras = new HashSet<>();
        extras.add(words[0]);
        ListNode list = new ListNode(words[0].length());
        ListNode front  = list;
        for(int k = 1 ; k < words.length ; k++){
            if(!extras.contains(words[k])){
                ListNode temp = new ListNode(words[k].length());
                list.next = temp;
                list = list.next;
                extras.add(words[k]);
            }
        }
        return front;
    }
}