public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        // replace statement below with code you write
    
    int asum  = 0;
    int bsum = 0;
    int fsum = 0;

    while (a1 != null) {
        asum++;
        a1 = a1.next;
    }

    while (a2 != null) {
        bsum++;
        a2 = a2.next;
    }

    if (asum == bsum) {
        fsum++;
    }
    
    return fsum;
    }
    
}