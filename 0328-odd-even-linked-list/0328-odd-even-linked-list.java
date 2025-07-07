class Solution 
{
    public ListNode oddEvenList(ListNode head)
    {
        if(head==null)
        {
            return null;
            }
        if(head.next==null || head.next.next==null)
        {
            return head;
            }
       ListNode odd= head;
       ListNode FirstevenHead=head.next;
       ListNode even=head.next;
      while(even!=null && even.next!=null)
      {
        odd.next=odd.next.next;
        even.next=even.next.next;
        odd=odd.next;
        even=even.next;
      }
      odd.next=FirstevenHead;
      return head;
    }
}