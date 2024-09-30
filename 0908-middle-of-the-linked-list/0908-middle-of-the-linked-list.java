
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int count = 1;
        while(current!=null)
        {
            current = current.next;
            count++;
        }
        int mid = (count%2==0)?(count/2):((count/2)+1);
        current = head;
        count = 1;
        while(count!=mid)
        {
            current = current.next;
            count++;
        }
        return current;
    }
}