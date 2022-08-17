package Week01;

class SolutionMerge2SortList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode();
        ListNode temp = list;
        while (list1 != null && list2 != null){
            if ( list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 == null) temp.next = list2;

        if (list2 == null) temp.next = list1;
        return list.next;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    void printList() {
          ListNode temp = new ListNode(val, next);
          while (temp != null){
              System.out.print(temp.val+ " ");
              temp = temp.next;
          }
    }
}

public class Merge2SortList {
    public static void main(String[] args) {
        SolutionMerge2SortList solution = new SolutionMerge2SortList();
        // Test case goes here
        ListNode list1 = new ListNode(1,new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1,new ListNode(3, new ListNode(4)));
        ListNode resultList = solution.mergeTwoLists(list1, list2);
        resultList.printList();
    }
//    Runtime: 1 ms, faster than 80.10% of Java online submissions for Merge Two Sorted Lists.
//    Memory Usage: 42.7 MB, less than 74.05% of Java online submissions for Merge Two Sorted Lists.
//    Pretty satisfy with the result but first ver. code was too messy
}

