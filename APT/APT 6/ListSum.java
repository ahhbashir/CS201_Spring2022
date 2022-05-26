public class ListSum {
    public int sum(ListNode list, int thresh) {
        // replace statement below with code you write
        int fsum = 0;

        while (list != null) {
            if (list.info > thresh) {
                fsum += list.info;
            }
        list = list.next;
        }
    
    return fsum;
    }
}