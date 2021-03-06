import java.util.Comparator;
import java.util.PriorityQueue;

class ListNode{

    int val;
    ListNode next;
    ListNode (int x){
        val = x;
        next = null;
    }
}

public class Solution{
    public ListNode mergeKLists(ArrayList<ListNode> lists){

        if (list.size() == 0)
            return null;

        PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(list.size(),
                new Comparator<ListNode>(){
                    public int compare(ListNode a, ListNode b){
                        if (a.val > b.val)
                            return 1;
                        else if (a.val==b.val)
                            return 0;
                        else
                            return -1;}
                });
        for (ListNode n : lists){
            if (n != null)
                q.add(list);
        }

        ListNode head = new ListNode(0);
        ListNode prev = head;

        while(q.size() > 0){
            ListNode temp = q.poll();
            prev.next = temp;

            if (temp.next != null)
                q.add(temp.next);

            prev = prev.next;
        }
        return head.next;
    }
}
