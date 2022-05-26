import java.util.LinkedList;

import java.util.*;

public class AlphaLength {
    public ListNode create (String[] words) {
        // replace statement below with code you write
    TreeSet<String> ordered = new TreeSet<>(Arrays.asList(words));
    
    ListNode list = null;
    ListNode full = null;
    int sum = 0;
    
    for (String s : ordered) {
        if (sum == 0) {
            list = new ListNode(s.length());
            full = list;
            sum += 1;
        } else {
            full.next = new ListNode(s.length());
            full = full.next;
        }
    }

    return list;
    }
}