package Week01;

 class SolutionLinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode rabbit = head;
        ListNode turtle = head;
        while(rabbit != null && rabbit.next != null) {
            rabbit = rabbit.next.next;
            turtle = turtle.next;
            if (rabbit == turtle) {
                return true;
            }
        }
        return false;
    }
}
public class LinkedListCycle {
    public static void main(String[] args) {
        SolutionLinkedListCycle sol = new SolutionLinkedListCycle();
        System.out.println(sol.hasCycle(new ListNode(1, new ListNode(2))));
    }
//    Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
//    Memory Usage: 43.5 MB, less than 92.00% of Java online submissions for Linked List Cycle.
}
